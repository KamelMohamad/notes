package com.example.notes

import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.test.core.app.ActivityScenario
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class MainActivityTest {
    @get:Rule
    val testRule = createComposeRule()


    @Test
    fun when_Launching_app_I_can_see_the_add_button() {
        ActivityScenario.launch(MainActivity::class.java).use { Scenario ->
            testRule.onNodeWithTag("add_button")
                .assertIsDisplayed()
                .assertHasClickAction()
        }
    }

    @Test
    fun when_launching_app_I_Can_view_NoNotesSaved_Text() {
        ActivityScenario.launch(MainActivity::class.java).use { Scenario ->
            testRule.onNodeWithText("No notes saved yet").assertIsDisplayed()
        }
    }

    @Test
    fun when_lauching_the_app_with_1_note_saved_I_can_see_the_note() {
        ActivityScenario.launch(MainActivity::class.java).use { Scenario ->
            testRule.onNodeWithTag("Notes list item").assertIsDisplayed()
        }
    }

    @Test
    fun when_1_note_or_more_are_saved_te_no_notes_saved_yet_text_should_be_invisible() {
        ActivityScenario.launch(MainActivity::class.java).use { Scenario ->
            testRule.onNodeWithText("No notes saved yet").assertDoesNotExist()
        }
    }

}

