package com.rooksoto.leetcode.problems.tiq.easy.array

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class RemoveDuplicatesFromSortedArrayTest {

    private val testSubject = RemoveDuplicatesFromSortedArray()

    @Test
    fun `Example 1`() {
        // GIVEN
        val nums = intArrayOf(1, 1, 2)
        val expectedElements = intArrayOf(1, 2)
        val expected = 2

        // WHEN
        val actual = testSubject.solve(nums)

        // THEN
        actual shouldBeEqualTo expected

        checkArrays(nums, expectedElements, expected)
    }

    @Test
    fun `Example 2`() {
        // GIVEN
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val expectedElements = intArrayOf(0, 1, 2, 3, 4)
        val expected = 5

        // WHEN
        val actual = testSubject.solve(nums)

        // THEN
        actual shouldBeEqualTo expected

        checkArrays(nums, expectedElements, expected)
    }

    private fun checkArrays(
        array: IntArray,
        expectedElements: IntArray,
        indicesToCheck: Int
    ) = 0.until(indicesToCheck).forEach { index ->
        array[index] shouldBeEqualTo expectedElements[index]
    }
}
