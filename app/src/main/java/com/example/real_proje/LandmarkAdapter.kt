package com.example.real_proje

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.real_proje.databinding.RowBinding

class LandmarkAdapter(val landmarkList: ArrayList<Landmark>): RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {
    class LandmarkHolder(val binding: RowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LandmarkHolder(binding)
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.yemek.text = landmarkList[position].burger
        holder.binding.recyclerTextImage.setImageResource(landmarkList[position].burgersekil)
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kliklendi!", Toast.LENGTH_SHORT).show()
        }
    }
}