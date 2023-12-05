package com.example.beras_ai.ui.deskripsi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.beras_ai.databinding.FragmentDeskripsiBinding

class DeskripsiFragment : Fragment() {

    private var _binding: FragmentDeskripsiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDeskripsiBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}