package ru.bmstu.iu4.sem05

import ru.bmstu.iu4.sem05.common.Canvas
import ru.bmstu.iu4.sem05.common.print
import ru.bmstu.iu4.sem05.common.write
import ru.bmstu.iu4.sem05.impl.*
import java.io.File

object Starter {
    @JvmStatic
    fun main(args: Array<String>) {
        val figures = listOf(
                Line(Point(5, 10), Point(5, 16)),
                Line(Point(0, 0), Point(9, 15)),
                Line(Point(20, 20), Point(35, 35)),
                Rectangle(Point(35, 5), Point(50, 10)),
                Circle(Point(20, 10), 7)
        )

        val canvas = Canvas(100, 40, 1).draw(figures).also { it.print() }
        File("output.txt").bufferedWriter().use { canvas.write(it) }
    }
}