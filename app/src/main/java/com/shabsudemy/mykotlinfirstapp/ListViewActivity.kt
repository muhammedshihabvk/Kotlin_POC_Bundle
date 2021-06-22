package com.shabsudemy.mykotlinfirstapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ListViewActivity : AppCompatActivity() {

    lateinit var listview: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        listview = findViewById(R.id.listview)

        val sampleData = mutableListOf<String>()
        for (i in 1..10) {
            sampleData.add("sample Data $i")
        }
        listview.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sampleData)
        listview.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext, "you clicked on item ${sampleData.get(i)}", Toast.LENGTH_LONG).show()
        }
    }
}