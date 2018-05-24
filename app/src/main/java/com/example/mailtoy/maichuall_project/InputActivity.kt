package com.example.mailtoy.maichuall_project

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_input.*

class InputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
    }

    fun saveButtonClicked(view: View){
        val intent = Intent()
        val taskName = inputTaskEditText.text.toString()
        val taskTime = inputTimeEditText.text.toString()
        val taskPlace = inputPlaceEditText.text.toString()
        if(taskName != ""){
            intent.putExtra("TASK_NAME", "Event: " + taskName)
            intent.putExtra("TASK_TIME", "Time: "+ taskTime)
            intent.putExtra("TASK_PLACE", "Place: "+ taskPlace)
            setResult(Activity.RESULT_OK,intent)
        } else {
            setResult(Activity.RESULT_CANCELED)
        }
        finish()
    }

    fun cancelButtonClicked(view: View){
        setResult(Activity.RESULT_CANCELED)
        finish()
    }
}