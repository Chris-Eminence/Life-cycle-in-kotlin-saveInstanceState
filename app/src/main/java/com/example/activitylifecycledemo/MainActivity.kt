package com.example.activitylifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "Main Activity"
        const val KEY_REVENUE = "revenue_key"
    }

     private lateinit var textRevenue : TextView
     var increment = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG", "onCreate method called")
        setContentView(R.layout.activity_main)

        textRevenue = findViewById(R.id.textview)
       // textRevenue.text = increment.toString()

        val button = findViewById<FloatingActionButton>(R.id.fab)
        button.setOnClickListener {
            ++increment
            textRevenue.text = increment.toString()
        }
        if (savedInstanceState != null) {
            increment = savedInstanceState.getInt("KEY_REVENUE", 0)
            textRevenue.text = increment.toString()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG", "onRestart Called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("KEY_REVENUE", increment)
        Log.d("TAG", "onSaveInstanceState Called")
    }
}




