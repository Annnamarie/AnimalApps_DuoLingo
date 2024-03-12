package com.example.animalapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Tips: FloatingActionButton = findViewById(R.id.Tips)
        Tips.tooltipText = "Click here for a detailed instruction"
    }

}