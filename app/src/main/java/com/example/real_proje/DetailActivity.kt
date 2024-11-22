package com.example.real_proje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.real_proje.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var ItemList: ArrayList<Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ItemList = ArrayList()


        val Broccoli = Item(R.drawable.brokoli, "Broccoli")
        val Chili = Item(R.drawable.chili, " Chili")
        val Corn = Item(R.drawable.corn, " Corn ")
        val Carrot = Item(R.drawable.kok, "Carrot")
        val Broccolibir = Item(R.drawable.brokoli, "Broccoli")
        val Cornbir = Item(R.drawable.corn, " Corn ")
        val Chilibir = Item(R.drawable.chili, " Chili")
        ItemList.add(Broccoli)
        ItemList.add(Chili)
        ItemList.add(Corn)
        ItemList.add(Carrot)
        ItemList.add(Broccolibir)
        ItemList.add(Cornbir)
        ItemList.add(Chilibir)

        binding.recycleView3.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val ItemAdapter = ItemAdapter(ItemList)
        binding.recycleView3.adapter = ItemAdapter
        val intent = intent
        val selectedItem = intent.getSerializableExtra("Meal") as Meal
        binding.yemekiki.text = selectedItem.yemekadi
        binding.qiymetiki.text = selectedItem.price
        binding.melumat.text = selectedItem.melumat
        binding.Friediki.setImageResource(selectedItem.yemek)
        val intentiki = intent
        binding.iconbir.setOnClickListener() {
            val explicitIntent = Intent(this, MainActivity::class.java)
            startActivity(explicitIntent)


        }

    }
}