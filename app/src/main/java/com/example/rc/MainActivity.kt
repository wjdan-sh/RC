package com.example.rc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var RV: RecyclerView
    private lateinit var ed: EditText
    private lateinit var btn: Button
    private lateinit var names: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed = findViewById(R.id.ed)
        btn = findViewById(R.id.send)
        RV = findViewById(R.id.RV)
        names = ArrayList()

        RV.adapter = RVAdapter(names)
        RV.layoutManager = LinearLayoutManager(this)

        btn.setOnClickListener {
            val name = ed.text.toString()
            names.add(name)
            ed.text.clear()
            RV.adapter?.notifyDataSetChanged()
        }

    }
}