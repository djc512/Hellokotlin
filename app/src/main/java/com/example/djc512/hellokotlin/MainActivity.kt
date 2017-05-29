package com.example.djc512.hellokotlin

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var tv: TextView? = null
    var ctx: Context? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ctx = this
        tv = findViewById(R.id.tv) as TextView
        tv!!.text= "helloKotin"
        tv!!.setTextColor(resources.getColor(R.color.colorPrimary))
        tv!!.textSize = 15f
        tv!!.setOnClickListener { Toast.makeText(ctx,"hello",Toast.LENGTH_SHORT).show() }

    }
}
