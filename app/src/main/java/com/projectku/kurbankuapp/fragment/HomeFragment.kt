package com.projectku.kurbankuapp.fragment

import android.content.Intent
import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView
import com.projectku.kurbankuapp.R
import com.projectku.kurbankuapp.activity.ListDetailActivity
import com.projectku.kurbankuapp.adapter.AdapterKurbanHome
import com.projectku.kurbankuapp.data.KurbanData
import com.projectku.kurbankuapp.model.Kurban


class HomeFragment : Fragment() {

    private lateinit var rvKurbanHome: RecyclerView
    private var list: ArrayList<Kurban> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //RecyclerView List Pulsa
        rvKurbanHome = view.findViewById(R.id.rv_home_kurban)
        rvKurbanHome.setHasFixedSize(true)

        list.addAll(KurbanData.listData)
        showRecyclerList()

        customToolbar()

        val imgMore = view.findViewById<ImageView>(R.id.img_more)

        imgMore.setOnClickListener {
            val intent = Intent(activity, ListDetailActivity::class.java)
            activity?.startActivity(intent)
        }

    }

    private fun customToolbar(){
        val toolbarTitle = view?.findViewById<MaterialTextView>(R.id.toolbarTitle)
        toolbarTitle?.text = "Kurbanku"
        toolbarTitle?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24F)

    }

    private fun showRecyclerList(){
        rvKurbanHome.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val listHomeKurbanAdapter = AdapterKurbanHome(list)
        rvKurbanHome.adapter = listHomeKurbanAdapter
    }


}