package com.frey.msu.criminalintent

import androidx.room.PrimaryKey
import androidx.room.Entity
import java.util.*

@Entity
data class Crime (

    @PrimaryKey val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean

)
