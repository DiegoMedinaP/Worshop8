package com.example.worshop8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val console = "Nintendo"
        val console2 = "Xbox"

        val holaMUndo = ""
        val holaMUndo1 = ""
        val holaMUndo3 = ""

        for(i in 0 until 100){
            println(holaMUndo)
        }
    }
}