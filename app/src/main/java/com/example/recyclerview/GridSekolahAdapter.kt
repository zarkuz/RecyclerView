package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridSekolahAdapter(val listSekolah: ArrayList<Sekolah>): RecyclerView.Adapter<GridSekolahAdapter.GridViewHolder>() {
    inner class GridViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgLogo: ImageView = itemView.findViewById(R.id.civ_sekolah_grid)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view:View =  LayoutInflater.from(parent.context).inflate(R.layout.item_sekolah_grid, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSekolah.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listSekolah[position].logo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgLogo)
    }
}