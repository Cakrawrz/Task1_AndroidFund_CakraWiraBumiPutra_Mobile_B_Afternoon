package com.infinite.AndroidFund

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class Register : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button_register: Button = findViewById(R.id.button_register)
        button_register.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_register -> {
                val intent = Intent(this@Register, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

