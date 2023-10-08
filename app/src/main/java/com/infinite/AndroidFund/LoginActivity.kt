package com.infinite.AndroidFund

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUsername = findViewById(R.id.username)
        etPassword = findViewById(R.id.password)

        val bundle = intent.extras
        if (bundle != null) {
            etUsername.setText(bundle.getString("username"))
            etPassword.setText(bundle.getString("password"))
        }

        val button_login: Button = findViewById(R.id.button_login)
        button_login.setOnClickListener(this)

        val create_account: TextView = findViewById(R.id.create_account)
        create_account.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_login -> {
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                intent.putExtra("User", UserParcelize(etUsername.text.toString(), etPassword.text.toString()))
                startActivity(intent)
            }
        }
        when (v.id) {
            R.id.create_account -> {
                val intent = Intent(this@LoginActivity, Register::class.java)
                startActivity(intent)
            }
        }
    }
}