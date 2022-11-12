package com.francislainy.hellotalk

import com.francislainy.hellotalk.model.ActorData

object ActorMockData {

    val actorList = listOf(

        ActorData(
            actorId = 1,
            name = "shakira",
        ),

        ActorData(
            actorId = 1,
            name = "shakira",
        ),

        ActorData(
            actorId = 1,
            name = "shakira",
        ),

        ActorData(
            actorId = 1,
            name = "shakira",
        ),

        ActorData(
            actorId = 1,
            name = "shakira",
        ),

        ActorData(
            actorId = 1,
            name = "shakira",
        ),

        ActorData(
            actorId = 1,
            name = "shakira",
        ),

        ActorData(
            actorId = 1,
            name = "shakira",
        ),

        ActorData(
            actorId = 1,
            name = "shakira",
        ),

        )

    fun getActor(actorId: Int?): ActorData {
        return actorList.first { it.actorId == actorId }
    }

}