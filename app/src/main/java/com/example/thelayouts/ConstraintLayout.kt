package com.example.thelayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_constraint_layout.*

class ConstraintLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)
        val linearNavigate = this.toLinearId
        linearNavigate.setOnClickListener {
           val secondIntent = Intent(this, LinearLayout::class.java)
           startActivity(secondIntent)
//            Toast.makeText(this, "I am working", Toast.LENGTH_LONG).show()
        }
    }
}