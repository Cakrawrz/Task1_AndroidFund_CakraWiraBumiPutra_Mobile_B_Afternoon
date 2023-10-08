package com.infinite.AndroidFund

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tv = findViewById(R.id.home_page)

        val username = intent.getParcelableExtra<UserParcelize>("User")?.username
        val password = intent.getParcelableExtra<UserParcelize>("User")?.password
        tv.text = "Username : $username dan Password : $password"
    }
}