package com.example.notes

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class NotesViewModel: ViewModel() {
    private val state = MutableStateFlow(emptyList<Note>())
    val stateFlow = state.asStateFlow()
}