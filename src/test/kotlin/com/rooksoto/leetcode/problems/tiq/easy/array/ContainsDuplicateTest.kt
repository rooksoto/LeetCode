package com.rooksoto.leetcode.problems.tiq.easy.array

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class ContainsDuplicateTest {

    private val testSubject = ContainsDuplicate()

    @Test
    fun `Example 1`() {
        // GIVEN
        val nums = intArrayOf(1, 2, 3, 1)
        val expected = true

        // WHEN
        val actual = testSubject.solve(nums)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Example 2`() {
        // GIVEN
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = false

        // WHEN
        val actual = testSubject.solve(nums)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Example 3`() {
        // GIVEN
        val nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
        val expected = true

        // WHEN
        val actual = testSubject.solve(nums)

        // THEN
        actual shouldBeEqualTo expected
    }
}
