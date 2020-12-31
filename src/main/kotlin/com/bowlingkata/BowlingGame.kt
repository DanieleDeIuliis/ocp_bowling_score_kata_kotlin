package com.bowlingkata

interface Bonus {
    fun total(): Int
}

class BowlingGame(private val rolls: Rolls, private val bonus: Bonus) {
    fun roll(pins: Int) {
        rolls.add(pins)
    }

    fun score(): Int {
        return rolls.totalPins() + bonus.total()
    }


}
