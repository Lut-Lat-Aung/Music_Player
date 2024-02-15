package com.example.music_player

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.music_player.databinding.ActivityUserSignUpBinding

class UserSignUpActivity : AppCompatActivity() {

    private val view: ActivityUserSignUpBinding by lazy { ActivityUserSignUpBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.ButtonLogin2.setOnClickListener {
            Toast.makeText(this, "Going to Login", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, UserLoginActivity::class.java)
            startActivity(intent)
        }
    }
}