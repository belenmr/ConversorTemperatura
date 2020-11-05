package com.example.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView


class ResultActivity : AppCompatActivity() {

    private val TAG = "ResultActivity"
    private lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val bundle = intent.extras
        val tempResult =  bundle?.getInt("RESULTADO") ?: 0

        Log.i(TAG, "El resultado es $tempResult")
        txtResult.text = tempResult.toString()
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
        Log.i(TAG, "onDestroy")
    }
}