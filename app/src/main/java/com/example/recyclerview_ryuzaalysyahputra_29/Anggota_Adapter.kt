package com.example.recyclerview_ryuzaalysyahputra_29

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Anggota_Adapter(private val context: Context, private val anggota: List<Anggota>, val listener: (Anggota) -> Unit)
    : RecyclerView.Adapter<Anggota_Adapter.AnggotaViewHolder>(){
    class AnggotaViewHolder(view: View): RecyclerView.ViewHolder (view) {

        val imgAnggota = view.findViewById<ImageView>(R.id.img_item_photo)
        val namaAnggota = view.findViewById<TextView>(R.id.tv_item_name)
        val descAnggota = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(anggota: Anggota, listener: (Anggota) -> Unit){
            imgAnggota.setImageResource(anggota.imgAnggota)
            namaAnggota.text = anggota.namaAnggota
            descAnggota.text = anggota.descAnggota
            itemView.setOnClickListener{
                listener(anggota)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnggotaViewHolder {
        return AnggotaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.detail_car, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnggotaViewHolder, position: Int) {
        holder.bindView(anggota[position], listener)
    }

    override fun getItemCount(): Int = anggota.size
    }
