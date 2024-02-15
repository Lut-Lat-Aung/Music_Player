package com.example.music_player

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.music_player.adapter.ListView_Adapter
import com.example.music_player.databinding.ActivityListViewBinding
import com.example.music_player.databinding.ListviewItemBinding
import com.example.music_player.model.UserScore

class ListView_Activity : AppCompatActivity() {

    private val view: ActivityListViewBinding by lazy {
        ActivityListViewBinding.inflate(
            layoutInflater
        )
    }

    private val view1 : ListviewItemBinding by lazy {
        ListviewItemBinding.inflate(layoutInflater)
    }

    private val MusicList = listOf(
        UserScore(123, "Padamohn", "Olivia Rodrigo"),
        UserScore(456, "Montero ", "Lil Nas X"),
        UserScore(789, "Levitating", "Dua Lipa"),
        UserScore(101, "Stay", "The Kid LAROI and Justin Bieber "),
        UserScore(112, "Blinding Lights", "The Weekend"),
        UserScore(131, "Peaches", " Justin Bieber"),
        UserScore(415, "Butter", "BTS "),
        UserScore(161, "Jesse", "30"),
        UserScore(718, "Jasmine", "20"),
        UserScore(191, "Jared", "10"),
        UserScore(110, "Jill", "1000"),
        UserScore(111, "Jack", "1000")
    )





//
//        private val mediaPlayer: MediaPlayer? = null
//    // 2. Pause playback
//    fun pauseSound() {
//        if (mMediaPlayer?.isPlaying == true) mMediaPlayer?.pause()
//    }
//
//    // 3. Stops playback
//    fun stopSound() {
//        if (mMediaPlayer != null) {
//            mMediaPlayer!!.stop()
//            mMediaPlayer!!.release()
//            mMediaPlayer = null
//        }
//    }
//
//    // 4. Destroys the MediaPlayer instance when the app is closed
//    override fun onStop() {
//        super.onStop()
//        if (mMediaPlayer != null) {
//            mMediaPlayer!!.release()
//            mMediaPlayer = null
//        }
//    }

//    fun playContentUri(uri: Uri) {
//        var mMediaPlayer: MediaPlayer? = null
//        try {
//            mMediaPlayer = MediaPlayer().apply {
//                setDataSource(application, uri)
//                setAudioAttributes(
//                    AudioAttributes.Builder()
//                        .setUsage(AudioAttributes.USAGE_MEDIA)
//                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
//                        .build()
//                )
//                prepare()
//                start()
//            }
//        } catch (exception: IOException) {
//            mMediaPlayer?.release()
//            mMediaPlayer = null
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(view.root)


        view.TheList.adapter = ListView_Adapter(this, MusicList)

        var mMediaPlayer = MediaPlayer.create(this, R.raw.pinacolada)
        fun playSound() {
            mMediaPlayer.start()
        }
        fun pauseSound() {
            if (mMediaPlayer?.isPlaying == true) mMediaPlayer?.pause()
        }

        view1.ButtonPlay.setOnClickListener {
            val intent = Intent(this, Login_Page::class.java)
            startActivity(intent)
        }
        view1.PlayButton.setOnClickListener{
            playSound()
        }

        view1.PauseButton.setOnClickListener {
            pauseSound()
        }



    }
}