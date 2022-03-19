package com.rooksoto.leetcode

import com.rooksoto.leetcode.problems.lc_001_twosum.TwoSum
import com.rooksoto.leetcode.util.profile

fun main() {

    // Example usage of "profile" method
    // Use this file to test and profile solutions using "ClassName().solve(args)"
    val nums = intArrayOf(15, 11, 15, 11, 15, 11, 15, 11, 15, 11, 15, 2, 7, 11, 15)
    val target = 9

    profile(true) {
        val solution = TwoSum().solve(nums, target)
        println("Solution: ${solution.joinToString()}")
    }
}
