package com.heynoki.uidesigncompose.tabBar.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.heynoki.uidesigncompose.tabBar.model.TabItem

@Composable
fun CustomTabRow(
    tabItems: List<TabItem>,
    selectedTabIndex: Int,
    onTabSelected: (Int) -> Unit
) {

    TabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp),
        indicator = { tabPositions -> }  // Disable the default line indicator
    ) {
        tabItems.forEachIndexed { index, item ->
            CustomTab(
                title = item.title,
                icon = if (index == selectedTabIndex) item.selectedIcon else item.unselectedIcon,
                isSelected = index == selectedTabIndex,
                onClick = { onTabSelected(index) }
            )
        }
    }
}
