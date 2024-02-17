package com.rooksoto

interface Problem<I, O> {

    val id: Int

    val name: String

    val instructions: String

    val testInput: I

    val testSolution: O

    fun solve(input: I): O

    fun isSolved(): Boolean =
        solve(testInput) == testSolution
}
