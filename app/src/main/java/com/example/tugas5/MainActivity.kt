package com.example.tugas5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
        "SMPN 1 SURABAYA",
        "SMPN 2 SURABAYA",
        "SMPN 3 SURABAYA",
        "SMPN 4 SURABAYA",
        "SMPN 5 SURABAYA",
        "SMPN 6 SURABAYA",
        "SMPN 7 SURABAYA",
        "SMPN 8 SURABAYA",
        "SMPN 9 SURABAYA",
        "SMPN 10 SURABAYA"
    )
    val halo = arrayOf( "Dispendik Jawa Timur"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView.setHasFixedSize (true)
        mRecyclerView.layoutManager = LinearLayoutManager (this)
        for (i in 0 until listUsers.size) {
            list.add(Users (listUsers.get(i)))
            if (listUsers.size - 1 == i) {
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecyclerView.adapter = adapter
            }
        }
    }
}