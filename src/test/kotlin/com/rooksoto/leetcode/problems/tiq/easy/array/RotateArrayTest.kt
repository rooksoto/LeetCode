package com.rooksoto.leetcode.problems.tiq.easy.array

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class RotateArrayTest {

    private val testSubject = RotateArray()

    @Test
    fun `Example 1`() {
        // GIVEN
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val k = 3
        val expected = intArrayOf(5, 6, 7, 1, 2, 3, 4)

        // WHEN
        testSubject.solve(nums, k)

        // THEN
        nums shouldBeEqualTo expected
        checkArrays(nums, expected)
    }

    @Test
    fun `Example 2`() {
        // GIVEN
        val nums = intArrayOf(-1, -100, 3, 99)
        val k = 2
        val expected = intArrayOf(3, 99, -1, -100)

        // WHEN
        testSubject.solve(nums, k)

        // THEN
        nums shouldBeEqualTo expected
        checkArrays(nums, expected)
    }

    private fun checkArrays(
        array: IntArray,
        otherArray: IntArray
    ) = array.indices.forEach { index ->
        array[index] shouldBeEqualTo otherArray[index]
    }
}
