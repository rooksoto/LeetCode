package com.rooksoto.leetcode.problems.lc_009_palindromenumber

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class PalindromeNumberTest {

    private val testSubject = PalindromeNumber()

    @Test
    fun `Example 1`() {
        // GIVEN
        val x = 122
        val expected = true

        // WHEN
        val actual = testSubject.solve(x)

        // THEN
        expected shouldBeEqualTo actual
    }

    @Test
    fun `Example 2`() {
        // GIVEN
        val x = -121
        val expected = false

        // WHEN
        val actual = testSubject.solve(x)

        // THEN
        expected shouldBeEqualTo actual
    }

    @Test
    fun `Example 3`() {
        // GIVEN
        val x = 10
        val expected = false

        // WHEN
        val actual = testSubject.solve(x)

        // THEN
        expected shouldBeEqualTo actual
    }
}
