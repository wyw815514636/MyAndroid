package com.google.sample.apps.nowinandroid.ui.interests2pane

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.google.samples.apps.nowinandroid.feature.interests.navigation.InterestsRoute

fun NavGraphBuilder.interestsListDetailScreen() {
    composable<InterestsRoute> {
        InterestsListDetailScreen()
    }
}

@Composable
fun InterestsListDetailScreen(modifier: Modifier = Modifier) {
    Text(
        text = "Hello InterestsListDetailScreen",
        modifier = modifier
    )
}