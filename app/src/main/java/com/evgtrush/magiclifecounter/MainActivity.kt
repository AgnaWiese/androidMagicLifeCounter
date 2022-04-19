package com.evgtrush.magiclifecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootView = findViewById<View>(android.R.id.content)
        val helloButton = findViewById<Button>(R.id.hello_button)
        helloButton.setOnClickListener {
            Snackbar.make(rootView, "Не дожимай меня", Snackbar.LENGTH_LONG).show()
        }

    }
}