package com.example.a3layoutcode

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.a3layoutcode.databinding.RvItemBinding

class RvAdapter(var datalist: ArrayList<RvModel>, var context: Context) :
    RecyclerView.Adapter<RvAdapter.MyViewHolder>() {

    inner class MyViewHolder(var binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        var binding = RvItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.profile.setImageResource(datalist[position].profile)
        holder.binding.troop.text = datalist[position].troop
        holder.binding.level.text = datalist[position].level
        holder.itemView.setOnClickListener{
            Toast.makeText(context, datalist[position].troop, Toast.LENGTH_SHORT).show()
        }
        anim(holder.itemView)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    fun anim ( view: View){

        var animation = AlphaAnimation(0.0f,1.0f)
        animation.duration = 1000
        view.startAnimation(animation)
    }
}