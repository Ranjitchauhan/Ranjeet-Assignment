package com.example.androidfragment.Activitis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfragment.Fragments.LoginFragment
import com.example.androidfragment.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Thread(
            Runnable {
                Thread.sleep(3000)
              //  startActivity(Intent(this,AuthActivity::class.java))

                var intent=Intent(this,AuthActivity::class.java)
                startActivity(intent)
            }
        ).start()
    }

}