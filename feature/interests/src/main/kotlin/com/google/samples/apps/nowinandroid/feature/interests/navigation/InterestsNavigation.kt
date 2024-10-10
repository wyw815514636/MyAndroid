package com.google.samples.apps.nowinandroid.feature.interests.navigation

import androidx.navigation.NavController
import androidx.navigation.NavOptions
import kotlinx.serialization.Serializable

@Serializable
data class InterestsRoute(
    // The ID of the topic which will be initially selected at this destination
    val initialTopicId: String? = null,
)

fun NavController.navigateToInterests(
    initialTopicId: String? = null
) {
    navigate(route = InterestsRoute(initialTopicId))
}
