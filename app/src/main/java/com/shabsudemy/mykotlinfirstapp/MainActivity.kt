package com.shabsudemy.mykotlinfirstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.shabsudemy.mykotlinfirstapp.models.Hero
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    //use kotlin extension to get view

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)

        button6.setOnClickListener{
            var i= Intent(applicationContext, NavigationDrawerActivity::class.java)
            startActivity(i)
        }

        button7.setOnClickListener{
            var i= Intent(applicationContext, CoroutinesPOCActivity::class.java)
            startActivity(i)
        }



    }

    override fun onClick(v: View?) {
        val i:Intent
        when (v?.id) {
            R.id.button1 -> {
                i = Intent(applicationContext, SecondActivity::class.java)
                i.putExtra("key", Hero("shihab data from main activity",25))
                startActivity(i)
            }
            R.id.button2 ->{
                i= Intent(applicationContext, ListViewActivity::class.java)
                startActivity(i)
            }
            R.id.button3 ->{
                i= Intent(applicationContext, SharedPrefActivity::class.java)
                startActivity(i)
            }
            R.id.button4 ->{
                i= Intent(applicationContext, DynamicViewGenActivity::class.java)
                startActivity(i)
            }
            R.id.button5 ->{
                i= Intent(applicationContext, KotlinExtensionsPOCActivity::class.java)
                startActivity(i)
            }
            else -> println("unknown click")
        }
    }
}