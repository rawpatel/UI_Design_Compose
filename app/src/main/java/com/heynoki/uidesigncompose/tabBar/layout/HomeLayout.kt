package com.heynoki.uidesigncompose.tabBar.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.heynoki.uidesigncompose.R
import com.heynoki.uidesigncompose.tabBar.component.ItemCard
import com.heynoki.uidesigncompose.tabBar.model.Item


@Composable
fun HomeLayout() {
    val items = listOf(
        Item("Home Screen", R.drawable.man),
        Item("Home Screen", R.drawable.man),
        Item("Home Screen", R.drawable.man),
        Item("Home Screen", R.drawable.man),
        Item("Home Screen", R.drawable.man),
        Item("Home Screen", R.drawable.man),
        Item("Home Screen", R.drawable.man),
        Item("Home Screen", R.drawable.man),
        Item("Home Screen", R.drawable.man)


    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        // Title for the Home Screen
        Text(
            text = "Welcome to Home Screen",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Scrollable Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()) // Enables horizontal scroll
        ) {
            items.forEach { item ->
                ItemCard(item)
            }
        }
    }
}


@Preview (showBackground = true)

@Composable
fun previewHome(){
    HomeLayout()
}
