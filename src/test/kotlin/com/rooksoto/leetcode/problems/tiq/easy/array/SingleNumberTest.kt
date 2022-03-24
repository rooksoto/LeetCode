package com.rooksoto.leetcode.problems.tiq.easy.array

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class SingleNumberTest {

    private val testSubject = SingleNumber()

    @Test
    fun `Example 1`() {
        // GIVEN
        val nums = intArrayOf(2, 2, 1)
        val expected = 1

        // WHEN
        val actual = testSubject.solve(nums)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Example 2`() {
        // GIVEN
        val nums = intArrayOf(4, 1, 2, 1, 2)
        val expected = 4

        // WHEN
        val actual = testSubject.solve(nums)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Example 3`() {
        // GIVEN
        val nums = intArrayOf(1)
        val expected = 1

        // WHEN
        val actual = testSubject.solve(nums)

        // THEN
        actual shouldBeEqualTo expected
    }
}
