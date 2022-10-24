package com.example.worshop8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hola mundo")
        println("Hola mundo")

        for(i in 0 until 100){
            println(i.toString())
        }

        for(i in 0 until 100){
            println(i.toString())
        }
        for(i in 0 until 100){
            println(i.toString())
        }

        print("esto es un print nuevo del feature 2")
        print("esto es un print nuevo del feature 2")
        print("esto es un print nuevo del feature 2")

    }
}