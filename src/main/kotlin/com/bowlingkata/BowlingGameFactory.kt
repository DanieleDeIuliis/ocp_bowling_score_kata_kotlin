package com.bowlingkata

object BowlingGameFactory {
    fun build(): BowlingGame {
        val rolls = RollsHistory()
        return BowlingGame(rolls, BowlingBonusFactory.build(rolls))
    }
}

