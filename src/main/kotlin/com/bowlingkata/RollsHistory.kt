package com.bowlingkata

class RollsHistory : Rolls {
    private val rolls = mutableListOf<Int>()

    override fun add(pins: Int) {
        rolls.add(pins)
    }

    override fun all(): List<Int> {
        return rolls.toList()
    }

    override fun totalPins(): Int {
        return rolls.sum()
    }
}

