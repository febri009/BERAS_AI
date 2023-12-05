package com.example.beras_ai.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.beras_ai.data.model.DataTengkulaks
import com.example.beras_ai.databinding.FragmentDeskripsiBinding
import com.example.beras_ai.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var adapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = HomeAdapter(emptyList())
        binding.rvListKonten.adapter = adapter

        homeViewModel = ViewModelProvider(requireActivity())[HomeViewModel::class.java]
        homeViewModel.listTengkulaks.observe(viewLifecycleOwner){listTengkulaks ->
            setDataArticles(listTengkulaks)
        }

        homeViewModel.loadHome.observe(viewLifecycleOwner){loadHome ->
            showLoading(loadHome)
        }

        val layoutManager = LinearLayoutManager(requireActivity())
        binding.rvListKonten.layoutManager = layoutManager
        val itemDecoration = DividerItemDecoration(requireActivity(), layoutManager.orientation)
        binding.rvListKonten.addItemDecoration(itemDecoration)
    }

    private fun showLoading(isLoading: Boolean) {
        if (isLoading){
            binding.progressHome.visibility = View.VISIBLE
        }else{
            binding.progressHome.visibility = View.GONE
        }

    }

    private fun setDataArticles(listArticles: List<DataTengkulaks>) {
        adapter.listHome = listArticles
        adapter.filterList("")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}