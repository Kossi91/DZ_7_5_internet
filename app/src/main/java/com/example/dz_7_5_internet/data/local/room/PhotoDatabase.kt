package com.example.dz_7_5_internet.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dz_7_5_internet.data.local.room.dao.PhotoDao
import com.example.dz_7_5_internet.data.models.Photo

@Database(entities = [Photo::class], version = 1, exportSchema = false)
abstract class PhotoDatabase : RoomDatabase() {

    abstract fun photoDao(): PhotoDao
}