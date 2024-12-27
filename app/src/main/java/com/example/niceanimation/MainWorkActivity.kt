package com.example.niceanimation

import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AlphaAnimation
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainWorkActivity : AppCompatActivity() {

    private lateinit var mainTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_work)

        mainTextView = findViewById(R.id.mainTextView)

        mainTextView.visibility = View.VISIBLE
        val animation = AlphaAnimation(0f, 1f)
        animation.duration = 2000
        animation.interpolator = AccelerateDecelerateInterpolator()
        mainTextView.startAnimation(animation)

    }
}