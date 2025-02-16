package days

import model.Day
import kotlin.math.abs

object Day1 : Day {
    override val name get() = "Historian Hysteria"

    private fun locations(input: List<String>) = input
        .map { it.split("   ") }
        .let { list ->
            val left = list.map { it[0].toInt() }
            val right = list.map { it[1].toInt() }
            left to right
        }

    override fun part1(input: List<String>): Int {
        val (leftList, rightList) = locations(input).let { it.first.sorted() to it.second.sorted() }
        return List(leftList.size) { index -> abs(leftList[index] - rightList[index]) }.sum()
    }

    override fun part2(input: List<String>): Int {
        val (leftList, rightList) = locations(input)
        val occurrencesMap = rightList.associateWith { num -> rightList.count { it == num } }

        return leftList.sumOf { current ->
            val occurrences = occurrencesMap[current] ?: 0
            current * occurrences
        }
    }
}