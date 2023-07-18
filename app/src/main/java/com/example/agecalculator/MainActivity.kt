package com.example.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var Agebtn : Button
    lateinit var Agebutton: Button
lateinit var DOBTV:TextView
    lateinit var birthdate:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Agebtn  = findViewById(R.id.selectbtn)
        birthdate= findViewById(R.id.ageinmin)
        DOBTV = findViewById(R.id.DOBTv)
        Agebtn.setOnClickListener{
            DOBTV.text = "Hello This is my first app"
            Toast.makeText(this,"Button is clicked",Toast.LENGTH_SHORT).show()
            Agebutton=findViewById(R.id.selectbtn2)
            Agebutton.setOnClickListener {
                birthdate.text= "once again helloo"
                Toast.makeText(this, "again Button is clicked", Toast.LENGTH_SHORT).show()


            }    }    }    }

