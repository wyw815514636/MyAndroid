package com.google.samples.apps.nowinandroid.feature.foryou.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
object ForYouRoute

fun NavController.navigateToForYou() = navigate(route = ForYouRoute)

fun NavGraphBuilder.forYouScreen() {
    composable<ForYouRoute>{
        ForYouScreen()
    }
}

@Composable
fun ForYouScreen(modifier: Modifier = Modifier) {
    Text(
        text = "Hello ForYouScreen",
        modifier = modifier
    )
}