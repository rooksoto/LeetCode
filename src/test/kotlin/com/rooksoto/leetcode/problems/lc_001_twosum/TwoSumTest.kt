package com.rooksoto.leetcode.problems.lc_001_twosum

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class TwoSumTest {

    private val testSubject = TwoSum()

    @Test
    fun `Example 1`() {
        // GIVEN
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(0, 1)

        // WHEN
        val actual = testSubject.solve(nums, target)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Example 2`() {
        // GIVEN
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val expected = intArrayOf(1, 2)

        // WHEN
        val actual = testSubject.solve(nums, target)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Example 3`() {
        // GIVEN
        val nums = intArrayOf(3, 3)
        val target = 6
        val expected = intArrayOf(0, 1)

        // WHEN
        val actual = testSubject.solve(nums, target)

        // THEN
        actual shouldBeEqualTo expected
    }
}
