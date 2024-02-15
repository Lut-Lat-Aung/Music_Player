package com.example.music_player

//import com.example.fragmentdemo.databinding.ActivityButtonNevigationBinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
//import com.example.fragmentdemo.fragments.FragmentA
//import com.example.fragmentdemo.fragments.FragmentB
//import com.example.fragmentdemo.fragments.FragmentC
import com.example.music_player.databinding.ActivityButtonNevigationBinding
import com.example.music_player.fragments.DashboardFragment
import com.example.music_player.fragments.HomeFragment
//import com.example.music_player.ui.home.HomeFragment
//import com.example.music_player.fragments.HomeFragment
import com.example.music_player.ui.notifications.NotificationsFragment

class ButtonNevigation_Activity : AppCompatActivity() {

    private val view: ActivityButtonNevigationBinding by lazy {
        ActivityButtonNevigationBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)
        view.navView.setOnItemSelectedListener {


            when (it.itemId) {
                R.id.navigation_home -> changeFragment(HomeFragment())
                R.id.navigation_dashboard -> changeFragment(DashboardFragment())
                R.id.navigation_notifications -> changeFragment(NotificationsFragment())


                else -> false
            }
        }
    }

    private fun changeFragment(fragment: Fragment): Boolean {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.navFragment_view, fragment)
            .addToBackStack(fragment::class.java.name)
            .commit()
        return true
    }

}
