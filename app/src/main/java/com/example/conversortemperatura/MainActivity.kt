package com.example.conversortemperatura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var etKelvin : EditText
    private lateinit var rgTemp : RadioGroup
    private lateinit var btnConvert : Button
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    private fun setupUI() {
        setupToolbar()
        etKelvin = findViewById(R.id.etKelvin)
        rgTemp = findViewById(R.id.rgTemp)
        btnConvert = findViewById(R.id.btnConvert)

        btnConvert.setOnClickListener{ convertTemperature() }
    }


    private fun convertTemperature() {
        val tempKelvin = etKelvin.text.toString()
        if (tempKelvin.isNotEmpty()){
            val tempKelvinDouble = tempKelvin.toDouble()
            val result = when(getSelectedRadioButton()){
                R.id.rbCelsius -> convertToCelsius(tempKelvinDouble)
                R.id.rbFarenheit -> convertToFarenheit(tempKelvinDouble)
                else -> showMessage("Seleccione una opcion")
            }
        } else {
            showMessage("Ingrese una temperatura")
        }

        KeyBoardUtil.hideKeyboard(this)
    }

    private fun convertToFarenheit(temperatureKelvin: Double) {
        val result = ((temperatureKelvin - 273.15) * 9/5) + 32
        launchResultActivity(result)
    }

    private fun convertToCelsius(temperatureKelvin: Double) {
        val result = temperatureKelvin - 273.15
        launchResultActivity(result)
    }

    private fun getSelectedRadioButton(): Int {
        return rgTemp.checkedRadioButtonId
    }


    private fun launchResultActivity(result: Double) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("RESULT",result)
        startActivity(intent)
    }

    private fun showMessage(text: String) {
        Toast.makeText(this, text,Toast.LENGTH_LONG).show()
    }

    private fun setupToolbar(){
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Conversor de temperatura"
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