package com.francislainy.hellotalk.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.francislainy.hellotalk.MockData.movieList
import com.francislainy.hellotalk.model.MovieData
import com.francislainy.hellotalk.ui.theme.DarkPrimaryColor
import com.francislainy.hellotalk.ui.theme.PrimaryColor
import com.francislainy.hellotalk.ui.theme.SecondaryText
import com.francislainy.hellotalk.ui.theme.TextIcons

@Composable
fun MovieList(paddingValues: PaddingValues, navController: NavController) {
    Box(modifier = Modifier.padding(paddingValues)) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(movieList) { movieData ->
                MovieItem(movieData = movieData, onMovieClick = {
                    navController.navigate("detail_screen/${movieData.movieId}")
                })
            }
        }
    }
}

@Composable
fun MovieItem(movieData: MovieData, onMovieClick: () -> Unit = {}) {

    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 8.dp)
            .clickable {
                onMovieClick()
            }
    ) {

        Card(
            modifier = Modifier
                .padding(end = 8.dp)
                .size(40.dp)
                .clip(CircleShape), backgroundColor = DarkPrimaryColor
        ) {
            Text(
                text = movieData.character[0].toString(),
                color = TextIcons,
                textAlign = TextAlign.Center, modifier = Modifier.padding(8.dp)
            )
        }

        Column(Modifier.weight(2.0f)) {
            Row() {
                Column(modifier = Modifier.weight(2f)) {
                    Text(
                        text = movieData.actor,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryColor,
                    )
                }

                Column() {

                    Row() {

                        Icon(imageVector = Icons.Outlined.LocationOn, "", Modifier.size(16.dp))
                        Text(text = movieData.location, color = PrimaryColor, fontSize = 8.sp)
                    }
                }

                Column {

                    Row() {
                        Icon(imageVector = Icons.Outlined.Lock, "", Modifier.size(16.dp))
                        Text(text = movieData.room, color = PrimaryColor, fontSize = 8.sp)
                    }

                }

            }

            Row() {
                Text(
                    text = movieData.scene,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = SecondaryText,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Box(modifier = Modifier.padding(16.dp)) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(movieList) { movieData ->
                MovieItem(movieData = movieData)
            }
        }
    }
}
