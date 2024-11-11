package com.example.seniorcapstoneappfe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ResourcesAdapter(private val resourceList: List<String>) :
    RecyclerView.Adapter<ResourcesAdapter.ResourceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResourceViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_resource, parent, false)
        return ResourceViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResourceViewHolder, position: Int) {
        holder.resourceTitle.text = resourceList[position]
    }

    override fun getItemCount(): Int = resourceList.size

    class ResourceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val resourceTitle: TextView = itemView.findViewById(R.id.resource_title)
    }
}
