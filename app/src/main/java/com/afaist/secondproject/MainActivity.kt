package com.afaist.secondproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSecondActivity = findViewById<Button>(R.id.btn_show_second_activity)
        buttonSecondActivity.setOnClickListener {
            openSecondActivity()
        }
        val buttonThirdActivity = findViewById<Button>(R.id.btn_show_third_activity)
        buttonThirdActivity.setOnClickListener{
            openThirdActivity()
        }
    }

    private fun openThirdActivity() {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }

    private fun openSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}