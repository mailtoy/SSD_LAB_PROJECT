package com.example.mailtoy.maichuall_project

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startButtonClicked(view: View) {
        val intent = Intent(this,ShowActivity::class.java)
        startActivity(intent)
    }

    fun mapButtonClicked(view: View) {
        val intent = Intent(this,MapActivity::class.java)
        startActivity(intent)
    }
}