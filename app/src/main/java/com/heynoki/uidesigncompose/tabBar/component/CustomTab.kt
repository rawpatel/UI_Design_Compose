package com.heynoki.uidesigncompose.tabBar.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun CustomTab(
    title: String,
    icon: ImageVector,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    FilterChip(
        selected = isSelected,
        onClick = onClick,
        label = {
            Text(
                text = title,
                color = if (isSelected) Color.White else Color.Gray  // Text color based on selection
            )
        },
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = if (isSelected) Color.White else Color.Gray  // Icon color based on selection
            )
        },
        colors = FilterChipDefaults.filterChipColors(
            containerColor = if (isSelected) Color(0xFF6200EE) else Color(0xFFE0E0E0), // Background color for chip
            selectedContainerColor = Color(0xFF6200EE), // Selected background color
            labelColor = Color.White,
            selectedLabelColor = Color.White
        ),
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 4.dp)
            .width(120.dp) 
            .height(50.dp) 
    )
}
