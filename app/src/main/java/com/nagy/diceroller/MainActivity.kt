   package com.nagy.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

   class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //
        var RollButton : Button = findViewById(R.id.roll_button)
        RollButton.setOnClickListener {
            Toast. makeText( this,"lest's Roll",Toast.LENGTH_SHORT).show()
        }


    }
}