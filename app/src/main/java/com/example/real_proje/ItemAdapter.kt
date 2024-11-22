package com.example.real_proje

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.real_proje.databinding.HorizontalrowBinding

class ItemAdapter(val ItemList: ArrayList<Item>): RecyclerView.Adapter<ItemAdapter.ItemHolder>() {
    class ItemHolder(val binding: HorizontalrowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val binding = HorizontalrowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemHolder(binding)
    }

    override fun getItemCount(): Int {
        return ItemList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.binding.brokoli.text = ItemList[position].brokoli
        holder.binding.brocollisekil.setImageResource(ItemList[position].brokoliSekli)
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kliklendi!", Toast.LENGTH_SHORT).show()
        }
    }
}