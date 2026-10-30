package com.samigu8.leetcode.easy.palindromenumber;

/**
 * Problem: 9. Palindrome Number
 * Difficulty: Easy
 * Date Solved: 10/30/2026
 *
 * Approach:
 * Reverse the second half of the integer and compare it
 * with the first half.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x != 0 && x % 10 == 0) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}