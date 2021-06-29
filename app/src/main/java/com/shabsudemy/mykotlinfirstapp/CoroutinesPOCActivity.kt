package com.shabsudemy.mykotlinfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_coroutines_pocactivity.*
import kotlinx.coroutines.*
import kotlin.concurrent.thread

class CoroutinesPOCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_pocactivity)

        println("Main program starts ${Thread.currentThread().name}")
        Thread.sleep(2000)
        println("Main program ends ${Thread.currentThread().name}")

        thread {
            println("Fake Thread work start ${Thread.currentThread().name}")
            Thread.sleep(1000)
            println("Fake Thread work ends ${Thread.currentThread().name}")
//            textViewCorotines.text="shihab" // error due to bg thread(bg thread wont be able to update UI)
        }

        //this will create new thread to run this task
        GlobalScope.launch {
            println("Coroutine work start ${Thread.currentThread().name}")
            Thread.sleep(1000)
            println("Coroutine work ends ${Thread.currentThread().name}")
//            textViewCorotines.text = "shihab" //error due to bg thread(bg thread wont be able to update UI)
        }

        //this will block currrent thread and run code block
        runBlocking {
            println("Coroutine runBlocking work start ${Thread.currentThread().name}")
            delay(2000)
            println("Coroutine runBlocking work ends ${Thread.currentThread().name}")
        }

//        suspendSampleFunction(2000)  //wont be able to call on main thread , need coroutine scope
        GlobalScope.launch {
            println("suspend fun work start ${Thread.currentThread().name}")
            suspendSampleFunction(3000)
            println("suspend fun work end ${Thread.currentThread().name}")
        }

        //this will run on main thread
        GlobalScope.launch(Dispatchers.Main) {
            println("Coroutine2 work start ${Thread.currentThread().name}")
//            Thread.sleep(5000)
            delay(3000)
            println("Coroutine2 work ends ${Thread.currentThread().name}")
            textViewCorotines.text = "shihab"
        }
    }

    suspend fun suspendSampleFunction(time: Long){
        delay(time)
    }

}