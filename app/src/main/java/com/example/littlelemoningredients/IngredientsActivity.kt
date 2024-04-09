package com.example.littlelemoningredients

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IngredientsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredients)

        val dishName = intent.getStringExtra(EXTRA_DISH_NAME_KEY)

        val ingredientsList = findViewById<TextView>(R.id.ingredients_list)
        ingredientsList.text = when (dishName) {
            "Hamburger" -> "Minced meat\nBun\nTomato"
            "Pasta" -> "Spaghetti\nTomato\nParmesan"
            else -> "Unknown dish"
        }
    }

    companion object {
        private const val EXTRA_DISH_NAME_KEY = "DishName"

        fun start(context: Context, dishName: String) {
            val intent = Intent(context, IngredientsActivity::class.java).apply {
                putExtra(EXTRA_DISH_NAME_KEY, dishName)
            }
            context.startActivity(intent)
        }
    }
}
