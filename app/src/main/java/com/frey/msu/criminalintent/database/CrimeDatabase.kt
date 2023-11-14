package com.frey.msu.criminalintent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.frey.msu.criminalintent.Crime


@Database(entities =  [Crime::class], version = 1)
@TypeConverters(CrimeTypeConverters::class)

abstract class CrimeDatabase: RoomDatabase() {

    abstract fun crimeDao(): CrimeDao
}