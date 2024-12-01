package dev.rsandtner.aoc

fun main() {
    readPuzzle(1)
        .let { Lists.of(it) }
        .also { println("Part 1: ${Day01_Problem1().solve(it)}") }
        .also { println("Part 2: ${Day01_Problem2().solve(it)}") }
}

data class Lists(val list1: List<Int>, val list2: List<Int>) {

    companion object {
        fun of(input: List<String>): Lists {
            val (list1, list2) = input.map { it.substringBefore(" ").toInt() to it.substringAfterLast(" ").toInt() }
                .unzip()
            return Lists(list1, list2)
        }
    }
}

class Day01_Problem1 {
    fun solve(input: Lists) =
        input.list1.sorted()
            .zip(input.list2.sorted())
            .sumOf { Math.abs(it.first - it.second) }
}

class Day01_Problem2 {
    fun solve(input: Lists): Int {
        val frequency = input.list2.groupingBy() { it }.eachCount()
        return input.list1.sumOf { it * (frequency[it] ?: 0) }
    }
}
