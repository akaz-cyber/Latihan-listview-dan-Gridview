package com.sttbandung.latihanlistandview
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide;
class AdapterList(private val itemList: List<ItemList>):RecyclerView.Adapter<AdapterList.Viewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterList.Viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data,parent,false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: AdapterList.Viewholder, position: Int) {
       val item = itemList[position]
        holder.judul.text = item.judul
        holder.subJudul.text = item.subJudul
        Glide.with(holder.imageView.context).load(item.imageUrl).into(holder.imageView)
    }

    override fun getItemCount(): Int {
     return itemList.size
    }

    class Viewholder (@NonNull itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.item_image)
        val judul: TextView = itemView.findViewById(R.id.title)
        val subJudul : TextView = itemView.findViewById(R.id.sub_title)
    }

}