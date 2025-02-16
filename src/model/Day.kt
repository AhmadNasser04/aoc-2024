package model

interface Day {
    val name: String
    fun part1(input: List<String>): Any
    fun part2(input: List<String>): Any = TODO("Still working on part 1...")
}