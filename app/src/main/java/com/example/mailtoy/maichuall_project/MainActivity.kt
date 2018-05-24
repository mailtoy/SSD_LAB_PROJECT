package com.example.mailtoy.maichuall_project

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_input.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startButtonClicked(view: View) {
        val intent = Intent()
        val taskNameP = inputTaskEditText.text.toString()
        if(taskNameP != ""){
            intent.putExtra("TASK_NAMEP", taskNameP+"")

            setResult(Activity.RESULT_OK,intent)
//            val intents = Intent(this,ShowActivity::class.java)
//            startActivity(intents)

        } else {
            setResult(Activity.RESULT_CANCELED)
        }

        finish()



    }

}