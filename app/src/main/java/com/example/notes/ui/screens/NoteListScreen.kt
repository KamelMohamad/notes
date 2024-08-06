package com.example.notes.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun NoteListScreen(){
    Column(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {}, modifier = Modifier.testTag("add_button")) {
            Text(text = "Add Note",)
        }
    }
}