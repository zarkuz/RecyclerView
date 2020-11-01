package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private  lateinit var rvSekolah: RecyclerView
    private var list: ArrayList<Sekolah> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSekolah = findViewById(R.id.rv_sekolah)
        rvSekolah.setHasFixedSize(true)

        list.addAll(DataSekolah.listData)
//        showRecyclerViewListMode()
//        showRecyclerViewGridMode()
        showRecyclerViewCardMode()
    }

    private fun showRecyclerViewListMode(){
        rvSekolah.layoutManager = LinearLayoutManager(this)
        val listSekolahAdapter = ListSekolahAdapter(list)
        rvSekolah.adapter = listSekolahAdapter
    }
    private fun showRecyclerViewGridMode(){
        rvSekolah.layoutManager = LinearLayoutManager(this)
        val gridSekolahAdapter = GridSekolahAdapter(list)
        rvSekolah.adapter = gridSekolahAdapter
    }
    private fun showRecyclerViewCardMode(){
        rvSekolah.layoutManager = LinearLayoutManager(this)
        val cardSekolahAdapter = CardSekolahAdapter(list)
        rvSekolah.adapter = cardSekolahAdapter
    }
}