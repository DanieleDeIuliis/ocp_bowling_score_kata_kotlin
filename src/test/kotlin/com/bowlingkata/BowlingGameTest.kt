package com.bowlingkata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class BowlingGameTest {
    @Test
    internal fun `score is zero when all rolls are zero`() {
        val game: BowlingGame = BowlingGameFactory.build()

        repeat(20) {
            game.roll(0)
        }

        assertEquals(0, game.score())
    }

    @Test
    internal fun `score is 1 when only 1 pin is knocked down`() {
        val game: BowlingGame = BowlingGameFactory.build()

        repeat(20) {
            game.roll(1)
        }

        assertEquals(20, game.score())
    }

    @Test
    internal fun `score is 20 when there's a spare during the game`() {
        val game = BowlingGameFactory.build()

        game.roll(4)
        game.roll(6)
        game.roll(5)
        repeat(17) {
            game.roll(0)
        }

        assertEquals(20, game.score())
    }


    @Test
    internal fun `score is 32 when there's a strike during the game`() {
        val game = BowlingGameFactory.build()

        game.roll(10)
        game.roll(6)
        game.roll(5)
        repeat(16) {
            game.roll(0)
        }

        assertEquals(32, game.score())
    }
}