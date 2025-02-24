package com.hasan.jokeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.hasan.jokeapp.screen.MainScreen
import com.hasan.jokeapp.ui.theme.JokeAppTheme
import com.hasan.jokeapp.viewmodel.JokeViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: JokeViewModel by viewModels<JokeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JokeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        viewModel.getJokeList()
                        MainScreen(viewModel.jokeList)

                    }
                }
            }
        }
    }
}

