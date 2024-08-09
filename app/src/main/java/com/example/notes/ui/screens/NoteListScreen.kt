package com.example.notes.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign

@Composable
fun NoteListScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "No notes saved yet",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Button(onClick = {}, modifier = Modifier.testTag("add_button")) {
            Text(text = "Add Note")
        }
    }
}