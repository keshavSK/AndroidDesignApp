package com.developerskatta.androiddesignapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginScreenActivity : AppCompatActivity() {
    var emailId: EditText? = null
    var password: EditText? = null
    private var buttonLogin: Button? = null
    var tvLogin: TextView? = null
    var name: String = "Android"
    var email: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        emailId = findViewById(R.id.edtLoginEmail)
        password = findViewById(R.id.edtLoginPassword)
        buttonLogin = findViewById(R.id.btnLogin)
        tvLogin = findViewById(R.id.tvLoginForgotPassword)
        email = emailId!!.text.toString()
        buttonLogin?.setOnClickListener {
            val email = emailId?.text.toString()
            Toast.makeText(this, "Enter Email id : $email", Toast.LENGTH_LONG).show()
        }
        tvLogin!!.text = email
    }

    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isValidMobile(mobile: String): Boolean {
        return android.util.Patterns.PHONE.matcher(mobile).matches()
    }
}