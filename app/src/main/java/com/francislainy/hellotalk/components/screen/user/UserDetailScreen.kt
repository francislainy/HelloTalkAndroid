package com.francislainy.hellotalk.components.screen.user

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.francislainy.hellotalk.model.MovieData
import com.francislainy.hellotalk.ui.theme.DarkPrimaryColor
import com.francislainy.hellotalk.ui.theme.TextIcons

@Composable
fun UserDetailScreen(navController: NavController, movieData: MovieData) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        UserPersonalDetails(navController, movieData)
        UserProfileExtraInfo("Self Introduction", "Hi, My name is..")
        UserProfileExtraInfo("My Hometown", "Dublin")
        UserProfileExtraInfo("My Occupation", "Software Engineer")
        UserProfileExtraInfo("Interest & Hobbies", "K-pop")
        UserProfileExtraInfo("Places I want to visit", "China")
    }
}

@Composable
private fun UserProfileExtraInfo(header:String, answerText: String) {
    Column() {
        Text(
            text = header,
            fontSize = MaterialTheme.typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = answerText,
            fontSize = MaterialTheme.typography.h4.fontSize,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
private fun UserPersonalDetails(
    navController: NavController,
    movieData: MovieData
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Column() {
            Button(onClick = {
                navController.popBackStack()
            }) {
                Text(text = "Go Back to TopNews + ${movieData.movieId}")
            }


            Row() {

                Column() {
                    Card(
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .size(90.dp)
                            .clip(CircleShape),
                        backgroundColor = DarkPrimaryColor,
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = "FC",
                                color = TextIcons,
                                textAlign = TextAlign.Center,
                            )
                        }
                    }
                }

                Column() {

                    Row() {
                        Text(
                            text = "Fran",
                            fontSize = MaterialTheme.typography.h5.fontSize,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "32",
                            fontSize = MaterialTheme.typography.h5.fontSize,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Row() {

                        Column() {
                            Text(
                                text = "PT",
                                fontSize = MaterialTheme.typography.h6.fontSize,
                                fontWeight = FontWeight.Normal
                            )

                            Text(
                                text = "Portuguese",
                                fontSize = MaterialTheme.typography.h6.fontSize,
                                fontWeight = FontWeight.Normal
                            )
                        }
                        Column() {
                            Text(
                                text = "CH",
                                fontSize = MaterialTheme.typography.h6.fontSize,
                                fontWeight = FontWeight.Normal
                            )

                            Text(
                                text = "Chinese",
                                fontSize = MaterialTheme.typography.h6.fontSize,
                                fontWeight = FontWeight.Normal
                            )
                        }

                    }

                    Row() {

                        Text(
                            text = "@com.francislainyc",
                            fontSize = MaterialTheme.typography.h6.fontSize,
                            fontWeight = FontWeight.Normal
                        )

                        Text(
                            text = "Online",
                            fontSize = MaterialTheme.typography.h6.fontSize,
                            fontWeight = FontWeight.Normal
                        )

                    }
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Column() {
                Button(onClick = {
//                    navController.popBackStack()
                }) {
                    Text(text = "Go Back to TopNews")
                }



                Text(
                    text = "Fran",
                    fontSize = MaterialTheme.typography.h6.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }
}