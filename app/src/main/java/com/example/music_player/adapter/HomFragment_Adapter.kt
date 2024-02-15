import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.music_player.databinding.ListviewItemBinding
import com.example.music_player.model.UserScore
import com.example.music_player.fragments.HomeFragment

class HomFragment_Adapter(private val fragment: HomeFragment, private val musicList: List<UserScore>): BaseAdapter() {

    private class ViewHolder(binding: ListviewItemBinding) {
        val SongGenre = binding.IDSongGenre
        val SongName = binding.IDSongName
        val SongAuthor = binding.IDSongAuthor
    }

    override fun getCount(): Int = musicList.size

    override fun getItem(position: Int): Any = musicList[position]

    override fun getItemId(position: Int): Long = musicList[position].SongGenre.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding: ListviewItemBinding
        val viewHolder: ViewHolder
        val view: View

        if (convertView == null) {
            binding = ListviewItemBinding.inflate(LayoutInflater.from(fragment.requireContext()), parent, false)
            view = binding.root
            viewHolder = ViewHolder(binding)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val musicItem = musicList[position]
        viewHolder.SongGenre.text = musicItem.SongGenre.toString()
        viewHolder.SongName.text = musicItem.SongName
        viewHolder.SongAuthor.text = musicItem.SongAuthor

        return view
    }
}
