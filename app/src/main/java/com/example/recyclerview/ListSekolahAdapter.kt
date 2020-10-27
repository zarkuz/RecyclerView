package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSekolahAdapter(private val listSekolah: ArrayList<Sekolah>) : RecyclerView.Adapter<ListSekolahAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_nama)
        var tvKecamatan: TextView = itemView.findViewById(R.id.tv_kecamatan)
        var ivLogo: ImageView = itemView.findViewById(R.id.civ_sekolah)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_sekolah, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSekolah.size
    }

    override fun onBindViewHolder(holder: ListSekolahAdapter.ListViewHolder, position: Int) {
        val sekolah = listSekolah[position]

        Glide.with(holder.itemView.context)
            .load(sekolah.logo)
            .apply(RequestOptions().override(60, 60))
            .into(holder.ivLogo)
        holder.tvNama.text = sekolah.nama
        holder.tvKecamatan.text = sekolah.kecamatan
    }
}