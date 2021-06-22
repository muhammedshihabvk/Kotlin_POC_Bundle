package com.shabsudemy.mykotlinfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.setPadding

class DynamicViewGenActivity : AppCompatActivity() {

    lateinit var linearLayout: LinearLayout
    lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_view_gen)

        linearLayout = findViewById(R.id.linearLayout)
        button1 = findViewById(R.id.buttonGen)

        button1.setOnClickListener {
            println("Button clicked")
            val textView = TextView(this)
            linearLayout.orientation = LinearLayout.VERTICAL
            linearLayout.setPadding(5)
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            textView.layoutParams = params
            textView.text = "dynamic text generated"
            linearLayout.addView(textView)
        }

        val view = layoutInflater.inflate(R.layout.my_layout,null,false)
        linearLayout.addView(view)
    }
}