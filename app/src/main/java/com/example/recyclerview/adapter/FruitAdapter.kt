package com.example.recyclerview.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.fruit
import kotlinx.android.synthetic.main.layout_fruit.view.*

class fruitViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val fruitName=itemView.findViewById<TextView>(R.id.text_fruit)
    val fruitImage=itemView.findViewById<ImageView>(R.id.image)
}
class FruitAdapter(val fruitList: ArrayList<fruit>):RecyclerView.Adapter<fruitViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): fruitViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.layout_fruit,parent,false)
        return fruitViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }

    override fun onBindViewHolder(holder: fruitViewHolder, position: Int) {
        holder.fruitName.text=fruitList[position].name
        holder.fruitImage.setImageResource(fruitList[position].image)
    }
}