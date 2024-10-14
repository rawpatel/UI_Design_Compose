package com.heynoki.uidesigncompose.tabBar.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.ShoppingCart
import com.heynoki.uidesigncompose.tabBar.model.TabItem

val tabItems = listOf(
        TabItem(
            title = "Home",
            unselectedIcon = Icons.Outlined.Home,
            selectedIcon = Icons.Filled.Home,


        ),
        TabItem(
            title = "Browse",
            unselectedIcon = Icons.Outlined.ShoppingCart,
            selectedIcon = Icons.Filled.ShoppingCart,

        ),
        TabItem(
            title = "Account",
            unselectedIcon = Icons.Outlined.AccountCircle,
            selectedIcon = Icons.Filled.AccountCircle,

        ),
    )




