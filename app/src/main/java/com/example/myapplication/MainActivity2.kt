package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    lateinit var mat_card:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
/*
        mat_card = findViewById(R.id.mat_card)

        mat_card.setBackgroundResource(R.drawable.card_shape)*/

    }
}