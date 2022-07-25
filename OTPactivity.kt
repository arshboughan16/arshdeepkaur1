package com.arshdeepkaur1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OTPactivity : AppCompatActivity() {
    var email = ""
    lateinit var tvEmail: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpactivity)
        intent?.let { abc->
            if (abc.hasExtra("email"))
                email=abc.getStringExtra("email")as String
        }?:kotlin.run { }
        tvEmail=findViewById(R.id.tvemail)

        tvEmail.setText(email)
    }
}