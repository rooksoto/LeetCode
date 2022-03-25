package com.rooksoto.leetcode.problems.tiq.easy.string

class ReverseString {

    // ****************************************************************
    // Write a function that reverses a string. The input string is
    // given as an array of characters s.
    //
    // You must do this by modifying the input array in-place with O(1)
    // extra memory.
    // ****************************************************************

    // Example 1:
    // Input: s = ["h","e","l","l","o"]
    // Output: ["o","l","l","e","h"]

    // Example 2:
    // Input: s = ["H","a","n","n","a","h"]
    // Output: ["h","a","n","n","a","H"]

    // Constraints:
    // 1 <= s.length <= 105
    // s[i] is a printable ascii character.

    fun solve(
        s: CharArray
    ) = Solution().reverseString(s)

    class Solution {

        // Time Complexity: O(n), where n is the length of s
        // Space Complexity: O(1)
        fun reverseString(
            s: CharArray
        ) = s.indices.forEach { index ->
            val end = s.lastIndex - index
            if (index < end) {
                val temp = s[index]
                s[index] = s[end]
                s[end] = temp
            }
        }
    }
}
