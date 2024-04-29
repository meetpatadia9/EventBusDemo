package com.ipsmeet.eventbusdemo.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.ipsmeet.eventbusdemo.ui.baseutils.Toolbar
import com.ipsmeet.eventbusdemo.ui.screens.HomeScreen
import com.ipsmeet.eventbusdemo.ui.theme.EventBusDemoTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EventBusDemoTheme {
                Scaffold(
                    topBar = { Toolbar() }
                ) {
                    Box(modifier = Modifier.padding(it)) {
                        HomeScreen()
                    }
                }   // Scaffold
            }
        }   // setContent
    }

}