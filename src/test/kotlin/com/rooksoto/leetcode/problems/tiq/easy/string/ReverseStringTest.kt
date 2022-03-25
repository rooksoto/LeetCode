package com.rooksoto.leetcode.problems.tiq.easy.string

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class ReverseStringTest {

    private val testSubject = ReverseString()

    @Test
    fun `Example 1`() {
        // GIVEN
        val s = charArrayOf('h', 'e', 'l', 'l', 'o')
        val expected = charArrayOf('o', 'l', 'l', 'e', 'h')

        // WHEN
        testSubject.solve(s)

        // THEN
        s shouldBeEqualTo expected
        checkArrays(s, expected)
    }

    @Test
    fun `Example 2`() {
        // GIVEN
        val s = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
        val expected = charArrayOf('h', 'a', 'n', 'n', 'a', 'H')

        // WHEN
        testSubject.solve(s)

        // THEN
        s shouldBeEqualTo expected
        checkArrays(s, expected)
    }

    private fun checkArrays(
        array: CharArray,
        otherArray: CharArray
    ) = array.indices.forEach { index ->
        array[index] shouldBeEqualTo otherArray[index]
    }
}
