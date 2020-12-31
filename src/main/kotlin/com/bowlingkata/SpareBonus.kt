package com.bowlingkata

class SpareBonus(private val rolls: Rolls) : Bonus {

    override fun total(): Int {
        val all = rolls.all()


        return all.filterIndexed { index, _ ->
            if (index < 2) {
                false
            } else {
                val previousFrame = Pair(all[index - 2], all[index - 1])
                previousFrame.first + previousFrame.second == 10
            }

        }.sum()
    }
}

