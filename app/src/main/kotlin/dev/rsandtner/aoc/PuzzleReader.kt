package dev.rsandtner.aoc

fun readPuzzle(day: Int) = Thread.currentThread()
    .contextClassLoader
    .getResourceAsStream("input/day${day.format()}.txt")?.let {
        it.bufferedReader().readLines()
    } ?: emptyList()

fun Int.format() = this.toString().padStart(2, '0')
