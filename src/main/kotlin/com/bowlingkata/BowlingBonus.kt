package com.bowlingkata

class BowlingBonus(private val bonuses: List<Bonus>): Bonus {
    override fun total(): Int {
        return bonuses.map { it.total()}.sum()
    }
}