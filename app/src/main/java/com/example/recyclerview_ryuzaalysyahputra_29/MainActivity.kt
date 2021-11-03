package com.example.recyclerview_ryuzaalysyahputra_29

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val anggotaList = listOf<Anggota>(
            Anggota(
                R.drawable.car_2,
                "Nissan GTR",
                "Car ke-1"
            ),
            Anggota(
                R.drawable.car_3,
                "Nissan GTR",
                "Car ke-2"
            ),
            Anggota(
                R.drawable.car_4,
                "Nissan GTR",
                "Car ke-3"
            ),
            Anggota(
                R.drawable.car_5,
                "Nissan GTR",
                "Car ke-4"
            ),
            Anggota(
                R.drawable.car_6,
                "Nissan Silvia",
                "Car ke-5"
            ),
            Anggota(
                R.drawable.car_7,
                "Toyota Supra",
                "Car ke-6"
            ),
            Anggota(
                R.drawable.car_8,
                "Toyota Supra",
                "Car ke-7"
            ),
            Anggota(
                R.drawable.gtr,
                "Nissan GTR",
                "Car ke-8"
            )

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_anggota)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = Anggota_Adapter(this, anggotaList){
            val intent = Intent (this, DetailAnggotaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}