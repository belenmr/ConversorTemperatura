package com.example.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.widget.Toolbar


class ResultActivity : AppCompatActivity() {

    private val TAG = "ResultActivity"
    private lateinit var txtResult: TextView
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        setupUI()
    }

    private fun setupUI() {
        setupToolbar()
        txtResult = findViewById(R.id.txtResult)

        val bundle = intent.extras
        val tempResult =  bundle?.getDouble("RESULT") ?: 0

        Log.i(TAG, "El resultado es $tempResult")
        txtResult.text = tempResult.toString()
    }

    private fun setupToolbar() {
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Resultado"
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