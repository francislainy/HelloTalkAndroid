package com.francislainy.hellotalk.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.francislainy.hellotalk.ui.theme.PrimaryColor
import com.francislainy.hellotalk.ui.theme.TextIcons

@Composable
fun HomeAppBar() {
    Box(modifier = Modifier) {
        Column(modifier = Modifier.requiredHeight(50.dp))
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp)
                    .background(PrimaryColor)
            ) {
                IconButton(onClick = {}) {
                    Icon(Icons.Default.Face, "Menu", Modifier.background(TextIcons))
                }
                Text(text = "Mb Movies", fontWeight = FontWeight.Bold, color = TextIcons, modifier = Modifier.weight(2.0f))
            }
        }
    }
}
