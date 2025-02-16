package days

import model.Day

object Day2 : Day {
    override val name get() = "Red-Nosed Reports"

    private fun reports(input: List<String>): List<List<Int>> = input.map { report ->
        report.split(" ").map { it.toInt() }
    }

    private fun safe(report: List<Int>): Boolean {
        return true
    }

    override fun part1(input: List<String>): Int {
        return reports(input).count { safe(it) }
    }
}