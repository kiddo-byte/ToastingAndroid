package com.example.toastingappsean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var display_text:TextView
    private lateinit var edit_input_data:EditText
    private lateinit var submit_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_text = findViewById(R.id.txtdisplay)
        edit_input_data = findViewById(R.id.edtdata)
        submit_button = findViewById(R.id.btnsubmit)

        submit_button.setOnClickListener {

            Toast.makeText(this, "TED",Toast.LENGTH_SHORT).show()
        }

    }
}