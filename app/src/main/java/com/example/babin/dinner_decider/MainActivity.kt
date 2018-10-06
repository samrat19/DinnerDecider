package com.example.babin.dinner_decider

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val  foodlist = arrayListOf("Chinese","Indian","Sizzler","Thai")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*in java we had to use find view by Id but in Kotlin we don't need that
        we can  use the widget id directly here and it works .
         */

        // here is how to use on Click listener in kotlin

        button.setOnClickListener {

            // here defined the Random class
            val random = Random()

            // getting any random index from the upper defined arraylist

            val randomFood = random.nextInt(foodlist.count())
            // putting the value of the index in the textview

            textView.text = foodlist[randomFood]
        }

        // here is how to add a food item in the array list

        button2.setOnClickListener {
            // here we are getting the value from the user input
            val foodItem = editText.text.toString()

            // here we are adding the new food
            foodlist.add(foodItem)

            //now clearing the edit Text
            editText.text.clear()
        }
    }
}
