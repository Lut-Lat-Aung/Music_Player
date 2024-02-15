package com.example.music_player

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.music_player.databinding.ActivityLoginPageBinding
import com.example.music_player.databinding.ActivityUserLoginBinding

class UserLoginActivity : AppCompatActivity() {


    private val view: ActivityUserLoginBinding by lazy{ ActivityUserLoginBinding.inflate(layoutInflater)}



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.SignUpButton.setOnClickListener {
            Toast.makeText(this, "Going to SignUp", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, UserSignUpActivity::class.java)
            startActivity(intent)
        }

//        view.ButtonLogin.setOnClickListener {
//            val intent = Intent(this, SlidingUpActivity::class.java)
//            startActivity(intent)
//        }

    }
}