package com.example.rc

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*
import java.util.ArrayList

class RVAdapter( val names: ArrayList<String>):
    RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {
    class ItemViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val name = names[position]
        holder.itemView.apply {

            tv2.text= name
        }
    }

    override fun getItemCount()= names.size
}