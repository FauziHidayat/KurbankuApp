package com.projectku.kurbankuapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.projectku.kurbankuapp.R
import com.projectku.kurbankuapp.adapter.AdapterKurban
import com.projectku.kurbankuapp.data.KurbanData
import com.projectku.kurbankuapp.model.Kurban

class ListDetailActivity : AppCompatActivity() {

    private lateinit var rvKurban: RecyclerView
    private var list: ArrayList<Kurban> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_detail)


        //RecyclerView List Pulsa
        rvKurban = findViewById<RecyclerView>(R.id.rv_detail_kurban)
        rvKurban.setHasFixedSize(true)

        list.addAll(KurbanData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvKurban.layoutManager = GridLayoutManager(this,2)
        val listKurbanAdapter = AdapterKurban(list)
        rvKurban.adapter = listKurbanAdapter


    }

}