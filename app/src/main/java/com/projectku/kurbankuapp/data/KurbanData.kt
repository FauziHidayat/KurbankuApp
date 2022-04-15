package com.projectku.kurbankuapp.data

import com.projectku.kurbankuapp.model.Kurban

object KurbanData {

    private val name = arrayOf(
        "Sapi merah",
        "Sapi limousin",
        "Sapi perah",
        "Sapi putih"
    )

    private val age = arrayOf(
        "40 Bulan",
        "40 Bulan",
        "40 Bulan",
        "40 Bulan",
    )

    private val weight = arrayOf(
        "100 Kg",
        "100 Kg",
        "100 Kg",
        "100 Kg",
    )

    private val price = arrayOf(
        "RP 40.000.000",
        "RP 40.000.000",
        "RP 40.000.000",
        "RP 40.000.000",
    )

    private val images = arrayOf(
        "https://images.unsplash.com/photo-1607771459220-36163d88974c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=388&q=80",
        "https://images.unsplash.com/photo-1609954111457-b377c9743c16?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=464&q=80",
        "https://images.unsplash.com/photo-1559484101-9c6be5b712cd?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=464&q=80",
        "https://images.unsplash.com/photo-1583308148140-b7079097d5df?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=885&q=80"
    )

    private val gender = arrayOf(
        "RP 40.000.000",
        "RP 40.000.000",
        "RP 40.000.000",
        "RP 40.000.000",
    )

    private val detail = arrayOf(
        "RP 40.000.000",
        "RP 40.000.000",
        "RP 40.000.000",
        "RP 40.000.000",
    )

    private val location = arrayOf(
        "RP 40.000.000",
        "RP 40.000.000",
        "RP 40.000.000",
        "RP 40.000.000",
    )

    private val rating = arrayOf(
        "RP 40.000.000",
        "RP 40.000.000",
        "RP 40.000.000",
        "RP 40.000.000",
    )

    val listData: ArrayList<Kurban>
        get() {
            val list = arrayListOf<Kurban>()
            for (position in name.indices){
                val kurban = Kurban()
                kurban.name = KurbanData.name[position]
                kurban.location = KurbanData.location[position]
                kurban.images = KurbanData.images[position]
                kurban.age = KurbanData.age[position]
                kurban.weight = KurbanData.weight[position]
                kurban.gender = KurbanData.gender[position]
                kurban.detail = KurbanData.detail[position]
                kurban.price = KurbanData.price[position]
                kurban.rating = KurbanData.rating[position]
                list.add(kurban)
            }

            return list
        }


}