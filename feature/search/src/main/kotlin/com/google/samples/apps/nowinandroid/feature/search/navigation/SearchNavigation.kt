package com.google.samples.apps.nowinandroid.feature.search.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val SEARCH_ROUTE = "search_route"

fun NavController.navigateToSearch() = navigate(SEARCH_ROUTE)

fun NavGraphBuilder.searchScreen() {
    // TODO: Handle back stack for each top-level destination. At the moment each top-level
    // destination may have own search screen's back stack.
    composable(route = SEARCH_ROUTE) {  backStackEntry ->
        SearchRoute()
    }
}

@Composable
fun SearchRoute(modifier: Modifier = Modifier) {
    Text(
        text = "Hello SearchRoute",
        modifier = modifier
    )
}