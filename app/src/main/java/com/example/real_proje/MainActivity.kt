package com.example.real_proje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.real_proje.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>
    private lateinit var mealList: ArrayList<Meal>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList()
        mealList = ArrayList()

        val burger = Landmark(R.drawable.sandivic, "Burger")
        val pizza = Landmark(R.drawable.pizza, "Pizza")
        val sandwich = Landmark(R.drawable.sos, "Sandwich")

        landmarkList.add(burger)
        landmarkList.add(pizza)
        landmarkList.add(sandwich)

        val mealOne = Meal(R.drawable.fried, "Fried Shrimp",R.drawable.time_num,"$29.00",R.drawable.fried,"Fried Shrimp","$29.00","This is my kind of breakfast egg sandwich")
        val mealTwo = Meal(R.drawable.yeni5, "Fried Shrimp",R.drawable.time_num,"$30.00",R.drawable.yeni5,"Fried Shrimp","$30.00","This is my kind of breakfast egg sandwich")
        val mealThree = Meal(R.drawable.fried, "Fried Shrimp",R.drawable.time_num,"$29.00",R.drawable.fried,"Fried Shrimp","$29.00","This is my kind of breakfast egg sandwich")
        val mealFour= Meal(R.drawable.yeni5, "Fried Shrimp",R.drawable.time_num,"$30.00",R.drawable.yeni5,"Fried Shrimp","$30.00","This is my kind of breakfast egg sandwich")

        mealList.add(mealOne)
        mealList.add(mealTwo)
        mealList.add(mealThree)
        mealList.add(mealFour)

        binding.recycleView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recycleView.adapter = landmarkAdapter

        binding.recycleView2.layoutManager = GridLayoutManager(this, 2)
        val mealAdapter = MealAdapter(mealList)
        binding.recycleView2.adapter = mealAdapter
    }
}