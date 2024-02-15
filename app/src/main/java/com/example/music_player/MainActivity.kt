package com.example.music_player

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.music_player.ButtonNevigation_Activity
import com.example.music_player.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val view: ActivityMainBinding by lazy{ActivityMainBinding.inflate(layoutInflater)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.ListButton.setOnClickListener {
            val intent = Intent(this, ListView_Activity::class.java)
            startActivity(intent)
        }

        view.LoginButton.setOnClickListener {
            val intent = Intent(this, Login_Page::class.java)
            startActivity(intent)
        }

        view.NevigationButton.setOnClickListener {
            val intent = Intent(this, ButtonNevigation_Activity::class.java)
            startActivity(intent)
        }


        var mMediaPlayer = MediaPlayer.create(this, R.raw.pinacolada)
        fun playSound() {
            mMediaPlayer.start()
        }
        fun pauseSound() {
        if (mMediaPlayer?.isPlaying == true) mMediaPlayer?.pause()
        }

        view.Play.setOnClickListener{
            playSound()
        }

        view.Pause.setOnClickListener {
            pauseSound()
        }

    }
}