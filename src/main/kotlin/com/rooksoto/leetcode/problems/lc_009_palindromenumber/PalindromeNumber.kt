package com.rooksoto.leetcode.problems.lc_009_palindromenumber

class PalindromeNumber {

    // ****************************************************************
    // Given an integer x, return true if x is a palindrome integer.
    //
    // An integer is a palindrome when it reads the same backward as
    // forward.
    //
    // For example, 121 is a palindrome while 123 is not.
    // ****************************************************************

    // Example 1:
    // Input: x = 121
    // Output: true
    // Explanation: 121 reads as 121 from left to right and from right
    // to left.

    // Example 2:
    // Input: x = -121
    // Output: false
    // Explanation: From left to right, it reads -121. From right to
    // left, it becomes 121-. Therefore, it is not a palindrome.

    // Example 3:
    // Input: x = 10
    // Output: false
    // Explanation: Reads 01 from right to left. Therefore, it is not
    // a palindrome.

    // Constraints:
    // -231 <= x <= 231 - 1

    fun solve(
        x: Int
    ): Boolean = Solution().isPalindrome(x)

    class Solution {

        // Time Complexity: O(n), where n is the number of digits in [x]
        // Space Complexity: O(2), as [number] and [reversed] are stored
        fun isPalindrome(
            x: Int
        ): Boolean {
            if (x < 0) return false
            if (x < 10) return true
            if (x % 10 == 0) return false
            var number = x
            var reversedX = 0

            while (number >= 10) {
                reversedX = (reversedX * 10) + (number % 10)
                number /= 10
            }
            if (number > 0) {
                reversedX = (reversedX * 10) + number
            }
            return x == reversedX
        }
    }
}

