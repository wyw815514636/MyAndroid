package com.google.sample.apps.nowinandroid.navigation

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector
import com.google.samples.apps.nowinandroid.core.designsystem.icon.NiaIcons
import com.wyw.myandroid.R
import com.google.samples.apps.nowinandroid.feature.bookmarks.R as bookmarksR
import com.google.samples.apps.nowinandroid.feature.foryou.R as forYouR
import com.google.samples.apps.nowinandroid.feature.search.R as searchR

enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    @StringRes val iconTextId: Int,
    @StringRes val titleTextId: Int,
) {
    FOR_YOU(
        selectedIcon = NiaIcons.Upcoming,
        unselectedIcon = NiaIcons.UpcomingBorder,
        iconTextId = forYouR.string.feature_foryou_title,
        titleTextId = R.string.app_name,
    ),
    BOOKMARKS(
        selectedIcon = NiaIcons.Bookmarks,
        unselectedIcon = NiaIcons.BookmarksBorder,
        iconTextId = bookmarksR.string.feature_bookmarks_title,
        titleTextId = bookmarksR.string.feature_bookmarks_title,
    ),
    INTERESTS(
        selectedIcon = NiaIcons.Grid3x3,
        unselectedIcon = NiaIcons.Grid3x3,
        iconTextId = searchR.string.feature_search_interests,
        titleTextId = searchR.string.feature_search_interests,
    ),
}