package com.example.beras_ai.ui.price

import com.example.beras_ai.data.model.DataPrices
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class PriceAdapterTest {

    @Mock
    private lateinit var mockPrices: List<DataPrices>

    private lateinit var priceAdapter: PriceAdapter

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        priceAdapter = PriceAdapter(mockPrices)
    }

    @Test
    fun getItemCount_returnsCorrectItemCount() {
        val itemCount = priceAdapter.itemCount

        assertEquals(mockPrices.size, itemCount)
    }
}




