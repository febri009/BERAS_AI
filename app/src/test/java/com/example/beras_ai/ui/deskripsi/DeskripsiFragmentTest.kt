package com.example.beras_ai.ui.deskripsi

import android.os.Build
import androidx.fragment.app.Fragment
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import org.robolectric.annotation.Config

@RunWith(MockitoJUnitRunner::class)
@Config(sdk = [Build.VERSION_CODES.P])
class DeskripsiFragmentTest {

    private var fragment: Fragment? = null

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun testDestroyView() {
        fragment?.onDestroyView()
        assert(fragment?.view == null)
        assert((fragment as? DeskripsiFragment)?._binding == null)
    }
}
