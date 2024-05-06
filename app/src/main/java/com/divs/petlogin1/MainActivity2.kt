package com.divs.petlogin1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var petImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
    }

    private fun setupGameScreen() {
        petImageView = findViewById(R.id.imageView)
        val feedbutton: Button = findViewById(R.id.feedbutton)
        val bathbutton: Button = findViewById(R.id.bathbutton)
        val playbutton: Button = findViewById(R.id.playbutton)

        feedbutton.setOnClickListener {
            petImageView.setImageResource(R.drawable.feeding_pet)
            updatePetStatus("feed")
        }

        bathbutton.setOnClickListener {
            petImageView.setImageResource(R.drawable.bathing_pet)
            updatePetStatus("bath")
        }

        playbutton.setOnClickListener {
            petImageView.setImageResource(R.drawable.happy_pet)
            updatePetStatus("play")
        }
    }


    private fun updatePetStatus(action: String) {
        when (action) {
            "feed" -> {



            }
            "bath" -> {


            }
            "play" -> {

            }
        }
    }
}