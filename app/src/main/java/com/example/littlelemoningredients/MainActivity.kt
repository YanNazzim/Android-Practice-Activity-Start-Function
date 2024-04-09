package com.example.littlelemoningredients

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.main_dish_1).setOnClickListener {
            IngredientsActivity.start(this, "Hamburger")
        }
        findViewById<View>(R.id.main_dish_2).setOnClickListener {
            IngredientsActivity.start(this, "Pasta")
        }
    }
}
