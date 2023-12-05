package com.example.beras_ai.ui.home

import com.example.beras_ai.data.model.DataTengkulaks
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

//@RunWith(MockitoJUnitRunner::class)
class HomeAdapterTest {

    private lateinit var homeAdapter: HomeAdapter

    @Before
    fun setUp() {
        val dataTengkulaks = listOf(
            DataTengkulaks("Address1", "Phone1", "Name1"),
            DataTengkulaks("Address2", "Phone2", "Name2")
        )
        homeAdapter = HomeAdapter(dataTengkulaks)
    }

    @Test
    fun testItemCount() {
        assertEquals(2, homeAdapter.itemCount)
    }
}