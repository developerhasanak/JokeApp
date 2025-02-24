package com.hasan.jokeapp.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.hasan.jokeapp.model.JokeData
import com.hasan.jokeapp.model.JokeDataItem

@Composable
fun MainScreen(jokeData: JokeData) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primaryContainer),
    ) {
        items(jokeData) {
            ItemRow(it)
        }
    }
}

@Composable
fun ItemRow(jokeDataItem: JokeDataItem) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(BorderStroke(2.dp, Color.Black))
            .background(MaterialTheme.colorScheme.primaryContainer)
            .padding(10.dp)
    ) {
        if (jokeDataItem.type == "single") {
            Text(
                text = jokeDataItem.joke ?: "null",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(2.dp)

                )
        } else {
            Column {
                Text(
                    text = "Setup:  " +jokeDataItem.setup,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(2.dp)

                )

                Text(
                    text = "Delivery: "+jokeDataItem.delivery ,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(2.dp)

                )
            }
        }


    }
}