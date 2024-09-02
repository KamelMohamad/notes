package com.example.notes

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class NotesViewModel(private val getNotesUseCase: GetNotesUseCase): ViewModel() {

    private val _state = MutableStateFlow(emptyList<Note>())
    val stateFlow = _state.asStateFlow()
    init {
        loadNotes()
    }

    fun loadNotes(){
        var notes = getNotesUseCase()
        _state.update { notes }
    }
}

