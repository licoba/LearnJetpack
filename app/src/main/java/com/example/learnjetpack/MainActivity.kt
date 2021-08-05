package com.example.learnjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(MyObserver()) // lifecycle 这里的lifecycle实际上是getlifecycle
    }

    override fun onStart() {
        super.onStart()
        Log.e(javaClass.name, "-------onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(javaClass.name, "-------onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(javaClass.name, "-------onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(javaClass.name, "-------onStop")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.e(javaClass.name, "-------onDestroy")
    }

}