package com.example.firstapp
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import android.widget.LinearLayout
import android.widget.Button
import com.example.firstapp.R.color.red
import com.example.firstapp.R.color.blue

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstapp.ui.theme.FirstappTheme

@SuppressLint("ResourceAsColor")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHot= findViewById<Button>(R.id.btnhot)
        val buttonCool = findViewById<Button>(R.id.btncool)
        val linearlayout= findViewById<LinearLayout>(R.id.linearlayout)
        buttonHot.setOnClickListener {
            linearlayout.setBackgroundColor(R.color.red)
        }
        buttonCool.setOnClickListener {
            linearlayout.setBackgroundColor(R.color.blue)
        }

    }
}

