package com.heynoki.uidesigncompose.tabBar.layout


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
fun BrowseLayout() {
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

        // Scrollable Row
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            items.forEach { item ->
                ItemCard(item)
            }
        }
    }
}


@Preview (showBackground = true)

@Composable
fun previewBrowse(){
    HomeLayout()
}



/*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.heynoki.uidesigncompose.ui.theme.Purple80





@Composable
fun BrowseLayout() {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Purple80),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Welcome to Browse Screen", color = Color.Black)
    }
}




@Preview (showBackground = true, widthDp = 480)
@Composable
fun BrowserPreview(){
    BrowseLayout()
}

 */
