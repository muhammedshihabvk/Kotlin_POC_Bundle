package com.shabsudemy.mykotlinfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.shabsudemy.mykotlinfirstapp.models.Hero

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val i:Intent = intent
//        var intentValue = i.getStringExtra("key")
//        println(intentValue)

        var res = i.getSerializableExtra("key") as Hero


        val textView:TextView = findViewById(R.id.textViewsecondActivity)
        textView.text= res.name


    }
}