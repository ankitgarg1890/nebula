package com.example.myapplication

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.drawable.toBitmap
import androidx.palette.graphics.Palette
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

class MainActivity : AppCompatActivity() {
    private lateinit var mrl_bg:ConstraintLayout
    private lateinit var mImage:ImageView
    private lateinit var txt_card:CardView
    private lateinit var bt_buy:Button
    lateinit var palette: Palette


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        supportActionBar?.hide()*/

        mrl_bg = findViewById(R.id.bg_con)

        mImage = findViewById(R.id.song_img)
        txt_card = findViewById(R.id.txt_card)
        bt_buy = findViewById(R.id.bt_buy)

    Glide.with(this)


        .load(R.drawable.img_1063_4).listener(object :RequestListener<Drawable>{

            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {

                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                Palette.from(resource!!.toBitmap()).generate() {
                    palette-> palette?.let {

                    val inColor= it.vibrantSwatch?.rgb?:0
                    mrl_bg.setBackgroundColor(inColor)
                }

                }
                  return false
            }


        }).into(mImage)


        txt_card.setBackgroundResource(R.drawable.txt_card_color)


    }
}