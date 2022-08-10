package com.example.roombasic.domain.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cat")
class Cat(
    @PrimaryKey var id: Long?,
    @ColumnInfo(name = "catname") var catName: String?,
    @ColumnInfo(name = "lifespan") var lifeSpan: Int,
    @ColumnInfo(name = "origin") var origin: String
) {
    constructor() : this(null,"",0, "")
}