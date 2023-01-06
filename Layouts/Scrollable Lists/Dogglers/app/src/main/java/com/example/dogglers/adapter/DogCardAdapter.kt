package com.example.dogglers.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogCardAdapter(private val context: Context?, private val layout: Int) :
    RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {
    class DogCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        //TODO("Not yet implemented")
        return DogCardViewHolder(null)
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        //TODO("Not yet implemented")
        val resources = context?.resources
    }

    override fun getItemCount(): Int = 0
}