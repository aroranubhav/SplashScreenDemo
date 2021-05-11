package com.maxi.splashscreendemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

private const val SPLASH_SCREEN_TIME_OUT: Long = 3000

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()
        launchHomeScreen()
    }

    private fun launchHomeScreen() {
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN_TIME_OUT)
    }
}