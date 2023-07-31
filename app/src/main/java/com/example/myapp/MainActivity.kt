package com.example.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat

class MainActivity : AppCompatActivity() {
    var numClicks = 0
    var textbox: EditText? = null
    var userInfo: TextView? = null
    var layout: LinearLayoutCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInfo = findViewById<TextView>(R.id.userinfo)
        textbox = findViewById<EditText>(R.id.textbox)
        layout = findViewById<LinearLayoutCompat>(R.id.MainLayout)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            myStyle()
            numClicks++
            userInfo?.text = "Olá ${textbox?.text} você já clicou ${numClicks} vezes"
        }
    }

    fun myStyle() {
        when {
            numClicks % 2 == 0 -> layout?.background = getDrawable(R.mipmap.fundo_1)
            numClicks % 3 == 0 -> layout?.background = getDrawable(R.mipmap.fundo_2)
            else -> layout?.background = getDrawable(R.mipmap.fundo_3)
        }
    }
}
