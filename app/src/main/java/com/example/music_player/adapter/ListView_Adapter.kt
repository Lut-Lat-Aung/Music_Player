package com.example.music_player.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.music_player.ListView_Activity
import com.example.music_player.R
import com.example.music_player.databinding.ListviewItemBinding
import com.example.music_player.model.UserScore

class ListView_Adapter(private val context: ListView_Activity, private val MusicList: List<UserScore>): BaseAdapter() {

//    inner class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
//        val artistTextView: TextView = itemView.findViewById(R.id.textViewArtist)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
//        val itemView = LayoutInflater.from(parent.context)
//            .inflate(R.layout.activity_music_item, parent, false)
//        return MusicViewHolder(itemView)
//    }
//
//    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
//        val currentItem = musicList[position]
//
//        holder.titleTextView.text = currentItem.title
//        holder.artistTextView.text = currentItem.artist
//    }
//
//    override fun getItemCount(): Int {
//        return musicList.size
//    }
//
//}

    private class ViewHolder(binding: ListviewItemBinding) {

        val SongGenre = binding.IDSongGenre
        val SongName = binding.IDSongName
        val SongAuthor = binding.IDSongAuthor

    }


    override fun getCount(): Int = MusicList.size

    override fun getItem(position: Int): Any = MusicList[position]

    override fun getItemId(position: Int): Long = MusicList[position].SongGenre

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            val binding = ListviewItemBinding.inflate(LayoutInflater.from(context), parent, false)

            view = binding.root
            viewHolder = ViewHolder(binding)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }

        val musiclist = MusicList[position]
        viewHolder.SongGenre.text = musiclist.SongGenre.toString()
        viewHolder.SongName.text = musiclist.SongName
        viewHolder.SongAuthor.text = musiclist.SongAuthor

        return view

    }




}