package com.example.notes

import io.mockk.every
import io.mockk.mockk
import org.junit.Test


class NotesViewModelTest {
    val getNotesUseCase : GetNotesUseCase = mockk()
    @Test
    fun when_viewmodel_created_state_contains_empty_notelist() {
        every { getNotesUseCase() } returns emptyList()
        val viewModel = NotesViewModel(getNotesUseCase)
        val viewModelState = viewModel.stateFlow.value

        assert(viewModelState.isEmpty())
    }

    @Test
    fun when_calling_load_notes_state_is_updated_accordingly() {
        val expectedNoteList =
            listOf(Note("Note 1", content = "Content 1"), Note("Note 2", content = "Content 2"))
        every { getNotesUseCase() } returns expectedNoteList
        val viewModel = NotesViewModel(getNotesUseCase)
        val actualNoteList = viewModel.stateFlow.value

        assert(expectedNoteList == actualNoteList)
    }
}