//package com.example.music_player.ui.home
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import com.example.music_player.adapter.ListView_Adapter
////import com.example.music_player.adapter.HomFragment_Adapter
//import com.example.music_player.databinding.FragmentHomeBinding
//import com.example.music_player.model.UserScore
//import com.example.music_player.databinding.ActivityListViewBinding
//import com.example.music_player.databinding.ListviewItemBinding
//
//class HomeFragment : Fragment() {
//
//    private var _binding: FragmentHomeBinding? = null
//
//    private val MusicList = listOf(
//        UserScore(123, "Padamohn", "Olivia Rodrigo"),
//        UserScore(456, "Montero ", "Lil Nas X"),
//        UserScore(789, "Levitating", "Dua Lipa"),
//        UserScore(101, "Stay", "The Kid LAROI and Justin Bieber "),
//        UserScore(112, "Blinding Lights", "The Weekend"),
//        UserScore(131, "Peaches", " Justin Bieber"),
//        UserScore(415, "Butter", "BTS "),
//        UserScore(161, "Jesse", "30"),
//        UserScore(718, "Jasmine", "20"),
//        UserScore(191, "Jared", "10"),
//        UserScore(110, "Jill", "1000"),
//        UserScore(111, "Jack", "1000")
//    )
//
//    // This property is only valid between onCreateView and
//    // onDestroyView.
//    private lateinit var view: FragmentHomeBinding
//
//    private val view1: ActivityListViewBinding by lazy {
//        ActivityListViewBinding.inflate(
//            layoutInflater
//        )
//    }
//
//    private val view2 : ListviewItemBinding by lazy {
//        ListviewItemBinding.inflate(layoutInflater)
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        view = FragmentHomeBinding.inflate(inflater, container, false)
//
//
//
//
////        view1.TheList.adapter = ListView_Adapter(this, MusicList)
//
////        var mMediaPlayer = MediaPlayer.create(this, R.raw.pinacolada)
////        fun playSound() {
////            mMediaPlayer.start()
////        }
////        fun pauseSound() {
////            if (mMediaPlayer?.isPlaying == true) mMediaPlayer?.pause()
////        }
//////
////        view2.ButtonPlay.setOnClickListener {
////            val intent = Intent(this, Login_Page::class.java)
////            startActivity(intent)
////        }
////        view2.PlayButton.setOnClickListener{
////            playSound()
////        }
////
////        view2.PauseButton.setOnClickListener {
////            pauseSound()
////        }
//
//        return view.root
//
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}