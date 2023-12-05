package com.example.beras_ai.ui.home

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.beras_ai.data.model.DataTengkulaks
import com.example.beras_ai.databinding.ListKontenBinding

class HomeAdapter(var listHome: List<DataTengkulaks>): RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    private var filteredList: List<DataTengkulaks> = listHome.toList()

    class ViewHolder(var binding: ListKontenBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListKontenBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = filteredList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listTengkulak = filteredList[position]

        with(holder.binding) {
            tvName.text = listTengkulak.name
            tvAddress.text = listTengkulak.address
            btPhone.setOnClickListener {
                val phone = listTengkulak.phone
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(phone)
                holder.itemView.context.startActivity(intent)
            }
        }
    }

    fun filterList(query: String) {
        filteredList = if (query.isEmpty()) {
            listHome.toList()
        } else {
            listHome.filter { item ->
                item.address.contains(query, ignoreCase = true)
            }
        }
        notifyDataSetChanged()
    }
}
