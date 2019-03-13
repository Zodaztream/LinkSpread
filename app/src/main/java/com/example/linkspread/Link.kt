package com.example.linkspread

import java.util.*

class Link() {
    private lateinit var mId: UUID
    private lateinit var mTitle: String
    private lateinit var mDate: Date
    private var mSolved: Boolean = false

    init {
        mId = UUID.randomUUID()
        mDate = Date()
    }

}