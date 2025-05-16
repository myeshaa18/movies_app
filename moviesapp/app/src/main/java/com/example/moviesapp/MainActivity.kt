package com.example.moviesapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesapp.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        // Find the Captain America and Dungeons & Dragons movie cards
        val captainAmericaCard: ImageView = findViewById(id.CaptainAmericaIcon)
        val dungeonsDragonsCard: ImageView = findViewById(id.dungeonsAndDragonsIcon)

        // Set click listener for Captain America card
        captainAmericaCard.setOnClickListener {
            val intent = Intent(this, CaptainAmericaDetailActivity::class.java)
            startActivity(intent)
        }

        // Set click listener for Dungeons & Dragons card
        dungeonsDragonsCard.setOnClickListener {
            val intent = Intent(this, DungeonsDragonsDetailActivity::class.java)
            startActivity(intent)
        }
    }
}