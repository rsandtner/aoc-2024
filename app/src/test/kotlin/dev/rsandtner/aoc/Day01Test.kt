package dev.rsandtner.aoc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day01Test {

    val input = Lists(
        listOf(3, 4, 2, 1, 3, 3),
        listOf(4, 3, 5, 3, 9, 3)
    )

    @Test
    fun problem1() {
        val result = Day01_Problem1().solve(input)
        Assertions.assertEquals(11, result)
    }

    @Test
    fun problem2() {
        val result = Day01_Problem2().solve(input)
        Assertions.assertEquals(31, result)
    }

}
