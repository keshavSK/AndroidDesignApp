package com.developerskatta.androiddesignapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginScreenActivity : AppCompatActivity() {
    var emailId: EditText? = null
    var password: EditText? = null
    var btnLogin: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        emailId = findViewById(R.id.edtLoginEmail)
        password = findViewById(R.id.edtLoginPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnLogin?.setOnClickListener {
            val email = emailId?.text.toString()
            val pass = password?.text.toString()
            if (!isValidEmail(email)) {
                Toast.makeText(this, "Please enter valid email id", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (!isValidMobile(pass)) {
                Toast.makeText(this, "Please enter valid mobile number", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val intent = Intent(this, LinearLayoutGravityActivity::class.java)
            startActivity(intent)
        }
    }

    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isValidMobile(mobile: String): Boolean {
        return android.util.Patterns.PHONE.matcher(mobile).matches()
    }
}