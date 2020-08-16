package com.nagy.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RollButton: Button = findViewById(R.id.roll_button)
        RollButton.setOnClickListener {
            RollDice()

        }


    }

    private fun RollDice() {

        val ResultText: TextView = findViewById(R.id.result_text)

        val RandomInt = Random().nextInt(6) + 1

        ResultText.text = RandomInt.toString()

    }
}