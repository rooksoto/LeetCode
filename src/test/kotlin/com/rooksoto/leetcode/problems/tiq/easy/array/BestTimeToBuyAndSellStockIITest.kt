package com.rooksoto.leetcode.problems.tiq.easy.array

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class BestTimeToBuyAndSellStockIITest {

    private val testSubject = BestTimeToBuyAndSellStockII()

    @Test
    fun `Example 1`() {
        // GIVEN
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 7

        // WHEN
        val actual = testSubject.solve(prices)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Example 2`() {
        // GIVEN
        val prices = intArrayOf(1, 2, 3, 4, 5)
        val expected = 4

        // WHEN
        val actual = testSubject.solve(prices)

        // THEN
        actual shouldBeEqualTo expected
    }

    @Test
    fun `Example 3`() {
        // GIVEN
        val prices = intArrayOf(7, 6, 4, 3, 1)
        val expected = 0

        // WHEN
        val actual = testSubject.solve(prices)

        // THEN
        actual shouldBeEqualTo expected
    }
}
