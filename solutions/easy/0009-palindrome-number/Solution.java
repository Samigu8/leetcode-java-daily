/**
 * Problem: 9. Palindrome Number
 * Difficulty: Easy
 * Date Solved: 2026-10-30
 *
 * Approach:
 * Reverse the integer and compare
 * with the original number.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

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