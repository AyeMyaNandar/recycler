package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.FruitAdapter
import com.example.recyclerview.model.fruit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView=findViewById(R.id.recycler_view)
          recyclerView.layoutManager=LinearLayoutManager(this)//horizontal
        //recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        //recyclerView.layoutManager=GridLayoutManager(this,2)

        val fruitList=ArrayList<fruit>()
        fruitList.add(fruit("Apple",R.drawable.love))
        fruitList.add(fruit("Orange",R.drawable.favorite_border))
        //fruitList.add(fruit("Blueberry"))
        //fruitList.add(fruit("Strawberry"))
        //fruitList.add(fruit("Potato"))
       // fruitList.add(fruit("Tomato"))
       // fruitList.add(fruit("Coconut"))
        //fruitList.add(fruit("RedBerry"))
        val fruitAdapter=FruitAdapter(fruitList)

        recyclerView.adapter=fruitAdapter
    }
}
