package com.example.music_player

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.music_player.databinding.ActivityLoginPageBinding

import com.example.music_player.databinding.ActivityMainBinding

class Login_Page : AppCompatActivity() {


    private val view: ActivityLoginPageBinding by lazy{ ActivityLoginPageBinding.inflate(layoutInflater)}



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.IDLogin.setOnClickListener {

            Toast.makeText(this, "You click Login",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, UserLoginActivity::class.java)
            startActivity(intent)

        }

        view.IDSignUp.setOnClickListener {
            Toast.makeText(this, "You click sign up", Toast.LENGTH_SHORT).show()
        }



    }
}