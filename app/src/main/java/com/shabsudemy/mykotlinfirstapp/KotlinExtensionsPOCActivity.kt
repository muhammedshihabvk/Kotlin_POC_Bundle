package com.shabsudemy.mykotlinfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_kotlin_extensions_pocactivity.*
import kotlinx.android.synthetic.main.alert_dialog.view.*

class KotlinExtensionsPOCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_extensions_pocactivity)

        textView.text= "shihab" // accessed xml widget with out initialization
        textView.textSize=30.0.toFloat()
        textView.setOnClickListener{
            println("clicked on shihab")
        }

        clickmeButton.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this@KotlinExtensionsPOCActivity)

            dialogBuilder.setTitle("Hey my name is shihab dialog")
            dialogBuilder.setIcon(R.drawable.ic_launcher_foreground)

            val alertDialogView:View = layoutInflater.inflate(R.layout.alert_dialog,null,false)
            dialogBuilder.setView(alertDialogView)

            val alertDialog = dialogBuilder.create()
            alertDialog.show()

            alertDialogView.clickmeButtonalertdialogue.setOnClickListener{
                println(alertDialogView.editTextalertdialog.text)
                alertDialog.cancel()
            }
        }
    }
}