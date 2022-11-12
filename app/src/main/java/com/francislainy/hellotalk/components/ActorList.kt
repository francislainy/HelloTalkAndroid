package com.francislainy.hellotalk.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.francislainy.hellotalk.ActorMockData.actorList
import com.francislainy.hellotalk.model.ActorData
import com.francislainy.hellotalk.ui.theme.DarkPrimaryColor
import com.francislainy.hellotalk.ui.theme.PrimaryColor
import com.francislainy.hellotalk.ui.theme.TextIcons

@Composable
fun ActorList(paddingValues: PaddingValues, navController: NavController) {
    Box(modifier = Modifier.padding(paddingValues)) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(actorList) { actorData ->
                ActorItem(actorData = actorData, onMovieClick = {
                    navController.navigate("detail_screen/${actorData.actorId}")
                })
            }
        }
    }
}



@Composable
fun ActorItem(actorData: ActorData, onMovieClick: () -> Unit = {}) {

    Row() {
        Column(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .clickable {
                    onMovieClick()
                }
        ) {
            Card(
                modifier = Modifier
                    .padding(end = 8.dp)
                    .size(60.dp)
                    .clip(CircleShape),
                backgroundColor = DarkPrimaryColor,
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = actorData.name.substring(0, 2),
                        color = TextIcons,
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }

        Column() {
            Text(
                text = actorData.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryColor,
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ActorListPreview() {
    Box(modifier = Modifier.padding(16.dp)) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(actorList) { actorData ->
                ActorItem(actorData = actorData)
            }
        }
    }
}
