package com.samigu8.leetcode.easy.palindromenumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    private final PalindromeNumber solution = new PalindromeNumber();

    @Test
    void palindromeNumber() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void negativeNumber() {
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void endingInZero() {
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    void zeroIsPalindrome() {
        assertTrue(solution.isPalindrome(0));
    }

    @Test
    void largestIntegerIsNotPalindrome() {
        assertFalse(solution.isPalindrome(Integer.MAX_VALUE));
    }

    @Test
    void evenLengthPalindrome() {
        assertTrue(solution.isPalindrome(1221));
    }
}