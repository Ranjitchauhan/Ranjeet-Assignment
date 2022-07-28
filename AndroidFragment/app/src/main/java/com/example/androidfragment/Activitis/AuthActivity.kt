package com.example.androidfragment.Activitis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfragment.Fragments.LoginFragment
import com.example.androidfragment.R
import com.example.androidfragment.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
        lateinit var binding:ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var frgment =LoginFragment()
        var manager = supportFragmentManager
        var Transation =manager.beginTransaction()
        Transation.add(R.id.fragment_container,frgment)
        Transation.commit()

    }
}