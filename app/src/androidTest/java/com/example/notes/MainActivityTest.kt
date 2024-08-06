package com.example.notes

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.example.notes.ui.screens.NoteListScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainActivityTest {

    @get:Rule
    val testRule = createComposeRule()

    @Test
    fun when_Launching_app_I_can_see_the_add_button(){
        testRule.setContent {
            NoteListScreen()
        }
        testRule.onNodeWithTag("add_button").assertIsDisplayed()
    }

}