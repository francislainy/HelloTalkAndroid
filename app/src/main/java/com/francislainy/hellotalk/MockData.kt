package com.francislainy.hellotalk

import com.francislainy.hellotalk.model.MovieData


object MockData {

    val movieList = listOf(

        MovieData(
            movieId = 1,
            character = "ji",
            scene = "a scene hsjdhsj dshjdhsj dhajhdsjhds dajkkhdsjhdsjh sajkjsaksjak",
            actor = "jennie",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 2,
            character = "shi",
            scene = "a scene",
            actor = "sean connery",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 3,
            character = "kui",
            scene = "a a scene hsjdhsj dshjdhsj dhajhdsjhds dajkkhdsjhdsjh sajkjsaksjak",
            actor = "keanu reeves",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 4,
            character = "lang",
            scene = "a scene",
            actor = "lebron james",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 5,
            character = "ming",
            scene = "a a scene hsjdhsj dshjdhsj dhajhdsjhds dajkkhdsjhdsjh sajkjsaksjak",
            actor = "miley cyrus",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 6,
            character = "zhi",
            scene = "a a scene hsjdhsj dshjdhsj dhajhdsjhds dajkkhdsjhdsjh sajkjsaksjak",
            actor = "george clooney",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 7,
            character = "shi",
            scene = "a scene",
            actor = "shakira",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 8,
            character = "shi",
            scene = "a scene",
            actor = "shakira",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 9,
            character = "shi",
            scene = "a a scene hsjdhsj dshjdhsj dhajhdsjhds dajkkhdsjhdsjh sajkjsaksjak a scene hsjdhsj dshjdhsj dhajhdsjhds dajkkhdsjhdsjh sajkjsaksjak a scene hsjdhsj dshjdhsj dhajhdsjhds dajkkhdsjhdsjh sajkjsaksjak",
            actor = "shakira",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 10,
            character = "shi",
            scene = "a scene",
            actor = "shakira",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 11,
            character = "shi",
            scene = "a scene",
            actor = "shakira",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 12,
            character = "shi",
            scene = "a scene",
            actor = "shakira",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 13,
            character = "shi",
            scene = "a scene",
            actor = "shakira",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 14,
            character = "shi",
            scene = "a scene",
            actor = "shakira",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 15,
            character = "shi",
            scene = "a scene",
            actor = "shakira",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 16,
            character = "shi",
            scene = "a scene",
            actor = "shakira",
            location = "childhood home",
            room = "bedroom",
        ),

        MovieData(
            movieId = 17,
            character = "shi",
            scene = "a scene",
            actor = "shakira",
            location = "childhood home",
            room = "bedroom",
        ),

        )

    fun getNews(movieId: Int?): MovieData {
        return movieList.first { it.movieId == movieId }
    }

}