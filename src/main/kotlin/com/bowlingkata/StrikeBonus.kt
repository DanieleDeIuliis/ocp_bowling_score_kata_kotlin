package com.bowlingkata

class StrikeBonus(private val rolls: Rolls): Bonus {
    override fun total(): Int {
        val all = rolls.all()

        var totalBonus = 0
        val strikeIndices = all
            .mapIndexed { index, value -> Pair(index, value) }
            .filter { it.second == 10 }
            .map { it.first }
        strikeIndices.forEach {
            for (index in 1..2) {
                if(it + index < all.size)
                    totalBonus += all[it + index]
            }
        }
        return totalBonus
    }
}

