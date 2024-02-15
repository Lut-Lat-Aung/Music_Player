// HomeFragment.kt
package com.example.music_player.fragments

import HomFragment_Adapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.music_player.R
//import com.example.music_player.adapter.HomFragment_Adapter
//import com.example.music_player.adapter.HomFragment_Adapter
import com.example.music_player.adapter.ListView_Adapter
import com.example.music_player.databinding.FragmentHomeBinding
//import com.example.music_player.MusicAdapter
import com.example.music_player.model.UserScore

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

//        // Initialize RecyclerView
//        val recyclerView: RecyclerView = view.findViewById(R.id.TheList)
//        recyclerView.layoutManager = LinearLayoutManager(activity)

        val listView: ListView = view.findViewById(R.id.TheList)
        val musicList1 = musicList() // Replace this with your actual music data
        val adapter = HomFragment_Adapter(this, musicList1)
        listView.adapter = adapter

//        listView.layoutManager = LinearLayoutManager(activity)

        return view
//        binding = FragmentHomeBinding.inflate(inflater, container, false)
//
//
//
//        val adapter = ListView_Adapter(musicList)
//        binding.TheList.adapter = adapter
//        binding.TheList.layoutManager = LinearLayoutManager(requireContext())
//
//        return binding.root
    }

    private fun musicList(): List<UserScore> {
        // Here you should provide your actual music data
        return listOf(
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

    }
}
