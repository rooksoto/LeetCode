package com.rooksoto.problems

import com.rooksoto.Problem


class TwoSum : Problem<TwoSum.InputParams, IntArray> {

    override val id: Int =
        1
    override val name: String =
        "To Wum"

    override val instructions: String =
        """
            Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

            You may assume that each input would have exactly one solution, and you may not use the same element twice.

            You can return the answer in any order.
        """.trimIndent()

    override val testInput: InputParams =
        InputParams(
            intArrayOf(2, 7, 11, 15),
            9
        )

    override val testSolution: IntArray =
        intArrayOf(0, 1)

    override fun solve(input: InputParams): IntArray =
        Solution().twoSum(input.nums, input.target)

    override fun isSolved(): Boolean =
        solve(testInput).contentEquals(testSolution)

    data class InputParams(
        @Suppress("ArrayInDataClass")
        val nums: IntArray,
        val target: Int
    )

    private class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val numIndexMap = mutableMapOf<Int, Int>()

            nums.forEachIndexed { index, num ->
                val complement = target - num

                if (numIndexMap.containsKey(complement)) return intArrayOf(numIndexMap[complement]!!, index)
                else numIndexMap[num] = index
            }

            throw IllegalArgumentException("No valid solution.")
        }
    }
}
