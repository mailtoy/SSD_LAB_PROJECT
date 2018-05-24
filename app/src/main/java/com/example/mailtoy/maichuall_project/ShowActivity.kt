package com.example.mailtoy.maichuall_project

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.content.Intent
import kotlinx.android.synthetic.main.activity_show.*

class ShowActivity : AppCompatActivity() {

    private val INPUT_REQUEST_CODE = 100
    private val INPUT_REQUEST_CODEs = 200
    val items = ArrayList<String>()
    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        mainTextView.text = intent.getStringExtra("TASK_NAMEP")
        adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items)
        itemListView.adapter = adapter
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == INPUT_REQUEST_CODEs) {
            if(data != null) {
                mainTextView.text = data.getStringExtra("TASK_NAMEP")
            }
        }
        if(requestCode == INPUT_REQUEST_CODE){
            if(resultCode != Activity.RESULT_CANCELED){
                if(data != null){
                    items.add(data.getStringExtra("TASK_NAME" ) +"\n"+ data.getStringExtra("TASK_TIME")
                            +"\n"+ data.getStringExtra("TASK_PLACE"))
                    adapter?.notifyDataSetChanged()
                }
            } else {
            }
        }
    }

    fun newButtonClick(view: View) {
        val intent = Intent(this,InputActivity::class.java)
        startActivityForResult(intent, INPUT_REQUEST_CODE)
    }
}