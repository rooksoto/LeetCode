package com.rooksoto.problems

import com.rooksoto.Problem

class ContainerWithMostWater : Problem<IntArray, Int> {

    override val id: Int =
        11

    override val name: String =
        "Container With Most Water"

    override val instructions: String =
        """
            You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

            Find two lines that together with the x-axis form a container, such that the container contains the most water.

            Return the maximum amount of water a container can store.

            Notice that you may not slant the container.
        """.trimIndent()

    override val testInput: IntArray =
        intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)

    override val testSolution: Int =
        49

    override fun solve(input: IntArray): Int =
        Solution().maxArea(input)
}

private class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex

        var result = 0

        while (left < right) {
            val distance = right - left
            val leftWallHeight = height[left]
            val rightWallHeight = height[right]
            val area = minOf(leftWallHeight, rightWallHeight) * distance
            if (area > result) result = area
            if (leftWallHeight < rightWallHeight) left++ else right--
        }
        return result
    }
}
