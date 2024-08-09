package com.example.notes.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign

@Composable
fun NoteListScreen(noteList: List<String> = emptyList()) {
    Column(modifier = Modifier.fillMaxSize()) {
        if (noteList.isEmpty()){
            Text(
                text = "No notes saved yet",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
        NotesItem()
        Button(onClick = {}, modifier = Modifier.testTag("add_button")) {
            Text(text = "Add Note")
        }
    }
}

@Composable
fun NotesItem() {
    Row (modifier = Modifier.fillMaxWidth().testTag("Notes list item")) {
        Text(text = "First note")
    }
}