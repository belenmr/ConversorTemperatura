package com.example.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    private fun setupUI() {

    }






    override fun onStart(){
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.i(TAG, "onDestroy")    }
}