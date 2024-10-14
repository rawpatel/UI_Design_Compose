package com.heynoki.uidesigncompose.tabBar.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.heynoki.uidesigncompose.R
import com.heynoki.uidesigncompose.tabBar.component.ItemCard
import com.heynoki.uidesigncompose.tabBar.model.Item
import com.heynoki.uidesigncompose.ui.theme.Purple40


@Composable
fun AccountLayout() {
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
            .padding(36.dp)
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)

    ) {
        // Title for the Home Screen
        Text(
            text = "Welcome to Home Screen",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 128.dp),
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
        ) {
            // Use the items function from LazyVerticalGrid
            items(items) { item ->
                ItemCard(item) // This is now in a composable context
            }
        }
    }
}


@Preview (showBackground = true)

@Composable
fun previewAcccount(){
    AccountLayout()
}

/*
@Composable
fun AccountLayout() {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Purple40),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Welcome to Account Screen", color = Color.Black)
    }
}

@Preview (showBackground = true)
@Composable
fun AccountPreview(){
    AccountLayout()
}

 */