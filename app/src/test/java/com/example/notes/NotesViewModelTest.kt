package com.example.notes

import org.junit.Test


class NotesViewModelTest {
    @Test
    fun when_viewmodel_created_state_contains_empty_notelist() {
        val viewModel = NotesViewModel()
        val viewModelState = viewModel.stateFlow.value

        assert(viewModelState.isEmpty())
    }

    @Test
    fun when_calling_load_notes_state_is_updated_accordingly() {
        val expectedNoteList =
            listOf(Note("Note 1", content = "Content 1"), Note("Note 2", content = "Content 2"))
        val viewModel = NotesViewModel()
        viewModel.loadNotes()
        val actualNoteList = viewModel.stateFlow.value

        assert(expectedNoteList == actualNoteList)
    }
}