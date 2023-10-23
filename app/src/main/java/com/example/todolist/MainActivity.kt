package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.expand_button1)
        var isButtonPressed = false

        myButton.setOnClickListener {
            if (isButtonPressed) {
                myButton.foreground = ContextCompat.getDrawable(this, R.drawable.ic_expand_more )
            } else {
                myButton.foreground = ContextCompat.getDrawable(this, R.drawable.ic_expand_less)
            }
            isButtonPressed = !isButtonPressed
        }
    }
}