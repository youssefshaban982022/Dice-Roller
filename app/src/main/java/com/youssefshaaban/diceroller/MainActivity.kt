package com.youssefshaaban.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val image: ImageView = findViewById(R.id.dice_iv)
        val imageTwo: ImageView = findViewById(R.id.two_dice_iv)
        val btn: Button = findViewById(R.id.roll_btn)

        btn.setOnClickListener {
            val random = (1..6).random()
            val randomTwo = (1..6).random()
            when (randomTwo) {
                1 -> imageTwo.setImageResource(R.drawable.dice_1)
                2 -> imageTwo.setImageResource(R.drawable.dice_2)
                3 -> imageTwo.setImageResource(R.drawable.dice_3)
                4 -> imageTwo.setImageResource(R.drawable.dice_4)
                5 -> imageTwo.setImageResource(R.drawable.dice_5)
                6 -> imageTwo.setImageResource(R.drawable.dice_6)

            }

            when (random) {
                1 -> image.setImageResource(R.drawable.dice_1)
                2 -> image.setImageResource(R.drawable.dice_2)
                3 -> image.setImageResource(R.drawable.dice_3)
                4 -> image.setImageResource(R.drawable.dice_4)
                5 -> image.setImageResource(R.drawable.dice_5)
                6 -> image.setImageResource(R.drawable.dice_6)
            }

        }
    }

}