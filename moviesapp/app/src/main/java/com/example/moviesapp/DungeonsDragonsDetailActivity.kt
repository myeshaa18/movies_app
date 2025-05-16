package com.example.moviesapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DungeonsDragonsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_dungeons_dragons)

        // Back button functionality
        val backButton: ImageView = findViewById(R.id.ivBack)
        backButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Bookmark button functionality (you can add your own logic)
        val bookmarkButton: ImageView = findViewById(R.id.ivBookmark)
        bookmarkButton.setOnClickListener {
            // Add bookmark logic here
        }

        // Watch Now button functionality
        val watchNowButton: Button = findViewById(R.id.btnWatch)
        watchNowButton.setOnClickListener {
            // Add watch now logic here
        }
    }
}