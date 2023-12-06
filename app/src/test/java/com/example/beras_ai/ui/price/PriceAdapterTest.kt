package com.example.beras_ai.ui.price

import com.example.beras_ai.data.model.DataPrices
import com.example.beras_ai.databinding.ListHargaBinding
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.powermock.api.mockito.PowerMockito.mock
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
@PrepareForTest(PriceAdapter::class)
class PriceAdapterTest {

    @Mock
    private lateinit var mockPrices: List<DataPrices>

    @Mock
    private lateinit var mockViewHolder: PriceAdapter.ViewHolder

    @Mock
    private lateinit var mockBinding: ListHargaBinding

    @InjectMocks
    private lateinit var priceAdapter: PriceAdapter

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun onBindViewHolder_isCorrect() {
        val mockPosition = 0
        `when`(mockPrices[mockPosition]).thenReturn(mock(DataPrices::class.java))
        `when`(mockViewHolder.binding).thenReturn(mockBinding)
        priceAdapter.onBindViewHolder(mockViewHolder, mockPosition)
        verify(mockBinding).tvDKI
        verify(mockBinding).tvPrice
    }
}