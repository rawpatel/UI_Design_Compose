package com.heynoki.uidesigncompose.tabBar.component


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.heynoki.uidesigncompose.tabBar.layout.AccountLayout
import com.heynoki.uidesigncompose.tabBar.layout.BrowseLayout
import com.heynoki.uidesigncompose.tabBar.layout.HomeLayout

@Composable
fun Tabs() {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val pagerState = rememberPagerState(pageCount = { tabItems.size })

    LaunchedEffect(selectedTabIndex) {
        pagerState.animateScrollToPage(selectedTabIndex)
    }

    LaunchedEffect(pagerState.currentPage, pagerState.isScrollInProgress) {
        if (!pagerState.isScrollInProgress) {
            selectedTabIndex = pagerState.currentPage
        }
    }

    Column(modifier = Modifier.fillMaxSize()) {
        // Custom TabRow with adjusted height and width
        CustomTabRow(
            tabItems = tabItems,
            selectedTabIndex = selectedTabIndex,
            onTabSelected = { index -> selectedTabIndex = index }
        )

        // Horizontal pager for content
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) { index ->
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                when (index) {
                    0 -> HomeLayout()
                    1 -> BrowseLayout()
                    2 -> AccountLayout()
                }
            }
        }
    }
}
