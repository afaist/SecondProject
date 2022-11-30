package com.afaist.secondproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val buttonSubmit = findViewById<Button>(R.id.submit)
        buttonSubmit.setOnClickListener {
            showResult()
        }
    }

    private fun showResult() {
        val login = findViewById<EditText>(R.id.in_user_name)
        val password = findViewById<EditText>(R.id.in_password)
        val resultText = findViewById<TextView>(R.id.lbl_result)
        val txt =
            "User: \"" + login.text.toString() + "\"  Password: \"" + password.text.toString() + "\""

        resultText.text = txt
    }
}