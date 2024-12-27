package com.example.niceanimation

import android.content.Intent
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.TranslateAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {

    private lateinit var registrationTitle: TextView
    private lateinit var loginEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var registerButton: Button
    private lateinit var linearLayoutLL: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        registrationTitle = findViewById(R.id.registrationTitle)
        loginEditText = findViewById(R.id.loginEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        registerButton = findViewById(R.id.registerButton)
        linearLayoutLL = findViewById(R.id.linearLayoutLL)

        registrationTitle.alpha = 0f
        registrationTitle.animate().alpha(1f).setDuration(2000).start()

        val titleAnimation = TranslateAnimation(0f, 0f, -200f, 0f)
        titleAnimation.duration = 2000
        titleAnimation.interpolator = AccelerateDecelerateInterpolator()
        registrationTitle.startAnimation(titleAnimation)

        linearLayoutLL.alpha = 0f
        linearLayoutLL.animate().alpha(1f).setDuration(2000).start()

        val linearLayoutAnimation = TranslateAnimation(0f, 0f, 200f, 0f)
        linearLayoutAnimation.duration = 2000
        linearLayoutAnimation.interpolator = AccelerateDecelerateInterpolator()
        linearLayoutLL.startAnimation(linearLayoutAnimation)

        registerButton.setOnClickListener {
            val intent = Intent(this, MainWorkActivity::class.java)
            startActivity(intent)
        }


    }
}