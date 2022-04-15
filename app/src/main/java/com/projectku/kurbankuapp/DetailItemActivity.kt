package com.projectku.kurbankuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class DetailItemActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_IMAGES = "extra_images"
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_WEIGHT = "extra_weight"
        const val EXTRA_GENDER = "extra_gender"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_RATING = "extra_rating"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_item)

        val btnBack: ImageButton = findViewById(R.id.btn_back)

        btnBack.setOnClickListener {
            onBackPressed()
        }

    }
}