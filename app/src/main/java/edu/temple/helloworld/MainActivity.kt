package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            displayTextView.text = "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"
        }

        displayTextView = findViewById(R.id.displayTextView)
        val editText = findViewById<EditText>(R.id.nameEditText)
        val button = findViewById<Button>(R.id.clickMeButton)



        button.setOnClickListener {
            val text = editText.text.toString().trim()

            if (text.isEmpty()) {
                editText.error = "This field cannot be empty"


            } else{
                editText.error = null
                displayTextView.text = "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"
            }
        }

    }
}