package com.google.samples.apps.nowinandroid.feature.bookmarks.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
object BookmarksRoute

fun NavController.navigateToBookmarks() =
    navigate(route = BookmarksRoute)

fun NavGraphBuilder.bookmarksScreen() {
    composable<BookmarksRoute> {
        BookmarksRoute()
    }
}

@Composable
fun BookmarksRoute(modifier: Modifier = Modifier) {
    Text(
        text = "Hello BookmarksRoute",
        modifier = modifier
    )
}