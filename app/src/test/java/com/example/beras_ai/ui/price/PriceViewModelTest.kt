package com.example.beras_ai.ui.price

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.example.beras_ai.data.model.DataPrices
import com.example.berasai.data.retrofit.ApiConfig
import com.example.berasai.data.retrofit.ApiService
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.any
import org.mockito.kotlin.doAnswer
import org.mockito.kotlin.verifyZeroInteractions
import org.mockito.kotlin.whenever
import retrofit2.Call
import retrofit2.Callback

@RunWith(MockitoJUnitRunner::class)
class PriceViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Mock
    private lateinit var apiService: ApiService

    @Mock
    private lateinit var dateCall: Call<DataPrices>

    @Mock
    private lateinit var pricesObserver: Observer<List<DataPrices>>

    @Mock
    private lateinit var loadPriceObserver: Observer<Boolean>

    @Mock
    private lateinit var priceDateObserver: Observer<DataPrices>

    private lateinit var viewModel: PriceViewModel

    @Before
    fun setUp() {
        ApiConfig.setApiService(apiService)
        viewModel = PriceViewModel()

        viewModel.listDataPrices.observeForever(pricesObserver)
        viewModel.loadPrice.observeForever(loadPriceObserver)
    }

    @Test
    fun testGetDatePriceFailure() {

        val mockThrowable = Throwable("Error message")

        whenever(apiService.getDate()).thenReturn(dateCall)
        whenever(dateCall.enqueue(any())).doAnswer {
            val callback = it.arguments[0] as Callback<DataPrices>
            callback.onFailure(dateCall, mockThrowable)
        }

        viewModel.getDatePrice()

        verifyZeroInteractions(priceDateObserver)
    }
}