package com.example.tizi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val background = object : Thread() {
            override fun run() {
                try {
                    sleep(3000)
                    startActivity(Intent(baseContext, MainActivity::class.java))
                } catch (e:Exception) {
                    e.printStackTrace()
                }
            }
        }.start()
    }
}
