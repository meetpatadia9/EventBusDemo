package com.ipsmeet.eventbusdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ipsmeet.eventbusdemo.ui.theme.EventBusDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EventBusDemoTheme {

            }
        }
    }
}