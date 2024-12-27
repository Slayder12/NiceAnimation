package com.example.niceanimation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.TranslateAnimation
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var startButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        startButton = findViewById(R.id.startButton)

        imageView.alpha = 0f
        imageView.animate().alpha(1f).setDuration(2000).start()

        startButton.visibility = View.VISIBLE
        val animation = TranslateAnimation(-800f, 0f, 0f, 0f)
        animation.duration = 2000
        animation.interpolator = AccelerateDecelerateInterpolator()
        startButton.startAnimation(animation)

        startButton.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }

    }
}