package com.samigu8.leetcode.easy.palindromenumber;

/**
 * Problem: 9. Palindrome Number
 * Difficulty: Easy
 * Date Solved: 10/30/2026
 *
 * Approach:
 * Reverse the integer and compare
 * with the original number.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x > 0) {

            int digit = x % 10;

            reversed = reversed * 10 + digit;

            x /= 10;
        }

        return original == reversed;
    }
}