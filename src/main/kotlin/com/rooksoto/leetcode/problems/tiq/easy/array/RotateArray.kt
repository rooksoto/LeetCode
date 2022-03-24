package com.rooksoto.leetcode.problems.tiq.easy.array

class RotateArray {

    // ****************************************************************
    // Given an array, rotate the array to the right by k steps, where
    // k is non-negative.
    // ****************************************************************

    // Example 1:
    // Input: nums = [1,2,3,4,5,6,7], k = 3
    // Output: [5,6,7,1,2,3,4]
    // Explanation:
    // rotate 1 steps to the right: [7,1,2,3,4,5,6]
    // rotate 2 steps to the right: [6,7,1,2,3,4,5]
    // rotate 3 steps to the right: [5,6,7,1,2,3,4]

    // Example 2:
    // Input: nums = [-1,-100,3,99], k = 2
    // Output: [3,99,-1,-100]
    // Explanation:
    // rotate 1 steps to the right: [99,-1,-100,3]
    // rotate 2 steps to the right: [3,99,-1,-100]

    fun solve(
        nums: IntArray,
        k: Int
    ) = Solution().rotate(nums, k)

    class Solution {

        // Time Complexity: O(n2), as we traverse the array exactly
        // twice
        // Space Complexity: O(1), as we modify the array in place
        fun rotate(
            nums: IntArray,
            k: Int
        ) {

            val actualSteps = k % nums.size

            reverse(nums, 0, nums.size)
            reverse(nums, 0, actualSteps)
            reverse(nums, actualSteps, nums.size)
        }

        private fun reverse(
            array: IntArray,
            start: Int,
            end: Int
        ) {
            val midPoint = start + ((end - start) / 2)
            var endPoint = end
            start.until(midPoint).forEach { index ->
                val temp = array[index]
                array[index] = array[endPoint - 1]
                array[endPoint - 1] = temp
                endPoint--
            }
        }
    }
}
