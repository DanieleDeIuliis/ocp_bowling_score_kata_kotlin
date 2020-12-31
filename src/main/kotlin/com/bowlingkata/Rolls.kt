package com.bowlingkata

interface Rolls {
    fun add(pins: Int)
    fun all(): List<Int>
    fun totalPins(): Int
}