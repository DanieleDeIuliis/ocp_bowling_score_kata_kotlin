package com.bowlingkata

object BowlingBonusFactory {
    fun build(rolls: RollsHistory): Bonus {
        return BowlingBonus(listOf(SpareBonus(rolls), StrikeBonus(rolls)))
    }
}