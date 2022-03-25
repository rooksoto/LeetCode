package com.rooksoto.leetcode.problems.tiq.easy.string

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class ReverseIntegerTest {

    private val testSubject = ReverseInteger()

    @Test
    fun `Example 1`() {
        // GIVEN
        val x = 123
        val expected = 321

        // WHEN
        val actual = testSubject.solve(x)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Example 2`() {
        // GIVEN
        val x = -123
        val expected = -321

        // WHEN
        val actual = testSubject.solve(x)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Example 3`() {
        // GIVEN
        val x = 120
        val expected = 21

        // WHEN
        val actual = testSubject.solve(x)

        // THEN
        actual shouldBeEqualTo expected
    }
}
