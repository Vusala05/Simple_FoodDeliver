package com.example.real_proje
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.real_proje.databinding.GreedRowBinding
class MealAdapter(val MealList: ArrayList<Meal>): RecyclerView.Adapter<MealAdapter.MealHolder>() {
    class MealHolder(val binding: GreedRowBinding): RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealAdapter.MealHolder {
        val binding = GreedRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MealAdapter.MealHolder(binding)
    }
    override fun getItemCount(): Int {
        return MealList.size
    }
    override fun onBindViewHolder(holder: MealHolder, position: Int) {
        holder.binding.fried.text = MealList[position].Mealname
        holder.binding.fish.setImageResource(MealList[position].YemekSekli)
        holder.binding.time.setImageResource(MealList[position].say_zaman)
        holder.binding.price.text = MealList[position].qiymet
        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,DetailActivity::class.java)
            intent.putExtra("Meal",MealList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}