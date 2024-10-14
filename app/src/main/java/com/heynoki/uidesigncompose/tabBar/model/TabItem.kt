package com.heynoki.uidesigncompose.tabBar.model

import androidx.compose.ui.graphics.vector.ImageVector

data class TabItem(
    val title: String,
    val unselectedIcon: ImageVector,
    val selectedIcon: ImageVector,

)