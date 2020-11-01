package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardSekolahAdapter(private val listSekolah: ArrayList<Sekolah>) : RecyclerView.Adapter<CardSekolahAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_nama)
        var tvKecamatan: TextView = itemView.findViewById(R.id.tv_kecamatan)
        var ivLogo: ImageView = itemView.findViewById(R.id.civ_sekolah)
        var btnPindah: Button = itemView.findViewById(R.id.btn_send)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_sekolah_card, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSekolah.size
    }

    override fun onBindViewHolder(holder: CardSekolahAdapter.CardViewHolder, position: Int) {
        val sekolah = listSekolah[position]

        Glide.with(holder.itemView.context)
            .load(sekolah.logo)
            .apply(RequestOptions().override(60, 60))
            .into(holder.ivLogo)
        holder.tvNama.text = sekolah.nama
        holder.tvKecamatan.text = sekolah.kecamatan
        holder.btnPindah.setOnClickListener {
            val intent = Intent(holder.itemView.context, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putString("data1", sekolah.nama)
            intent.putExtras(bundle)
            holder.itemView.context.startActivity(intent)
        }
    }
}