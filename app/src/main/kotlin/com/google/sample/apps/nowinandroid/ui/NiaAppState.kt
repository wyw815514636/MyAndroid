package com.google.sample.apps.nowinandroid.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.sample.apps.nowinandroid.navigation.TopLevelDestination
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
    coroutineScope: CoroutineScope,
) {

    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.entries

}