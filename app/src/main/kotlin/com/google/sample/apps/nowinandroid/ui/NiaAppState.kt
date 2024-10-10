package com.google.sample.apps.nowinandroid.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.util.trace
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.google.sample.apps.nowinandroid.navigation.TopLevelDestination
import com.google.sample.apps.nowinandroid.navigation.TopLevelDestination.*
import com.google.samples.apps.nowinandroid.feature.bookmarks.navigation.navigateToBookmarks
import com.google.samples.apps.nowinandroid.feature.foryou.navigation.navigateToForYou
import com.google.samples.apps.nowinandroid.feature.interests.navigation.navigateToInterests
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow


@Composable
fun rememberNiaAppState(
    navController: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope()
): NiaAppState {
    return remember(
        coroutineScope
    ) {
        NiaAppState(
            navController = navController,
            coroutineScope = coroutineScope
        )
    }
}

@Stable
class NiaAppState(
    val navController: NavHostController,
    coroutineScope: CoroutineScope
) {

    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.entries

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        trace("Navigation: ${topLevelDestination.name}") {
            when (topLevelDestination) {
                FOR_YOU -> navController.navigateToForYou()
                BOOKMARKS -> navController.navigateToBookmarks()
                INTERESTS -> navController.navigateToInterests(null)
            }
        }
    }

}