package com.example.lab2

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Activity2 : AppCompatActivity() {

    lateinit var text: TextView
    lateinit var image: ImageView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.txtView)
        image = findViewById(R.id.moodImg)
        button = findViewById(R.id.eatBtn)

    }

    public fun eatCookie(view: View){
        image.setImageResource(R.drawable.full);
        text.setText("I'm so full");
        button.setText("DONE");
    }

}