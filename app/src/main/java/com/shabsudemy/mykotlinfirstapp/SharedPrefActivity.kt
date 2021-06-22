package com.shabsudemy.mykotlinfirstapp

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SharedPrefActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var savedText: TextView
    lateinit var saveButton: Button

    companion object {
        val KEY = "sharefPrefKey"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_pref)
        initilizer()
        retriveSavedDataFromPref()

        saveButton.setOnClickListener {
            val editTextValue: String = editText.text.toString()
            val editor:SharedPreferences.Editor =  getSharedPrefEditor().edit()
            editor.putString("key", editTextValue.toString())
            editor.apply()
//            editor.commit()
            savedText.text = editTextValue
        }
    }

    fun initilizer() {
        println("init invoked")
        editText = findViewById(R.id.editTextTextPersonName)
        saveButton = findViewById(R.id.saveButton)
        savedText = findViewById(R.id.textViewSavedText)
    }

    fun retriveSavedDataFromPref() {
        val data: String? = getSharedPreferences("ShabsSharedPref", Context.MODE_PRIVATE).getString("key", "no value")
        println("data retrived: $data")
        savedText.setText(data).toString()
    }

    fun getSharedPrefEditor(): SharedPreferences {
        return getSharedPreferences("ShabsSharedPref", Context.MODE_PRIVATE)
    }



}