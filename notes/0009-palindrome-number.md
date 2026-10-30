# Palindrome Number

## Problem

Given an integer `x`, return `true` if `x` is a palindrome and `false` otherwise.

A palindrome reads the same forward and backward.

---

## Initial Thoughts

The simplest approach is to convert the integer to a String, reverse it, and compare the results.

However, the follow-up asks for a solution without converting the number into a String.

---

## Solution

### Approach

Reverse the digits of the integer using modulo and integer division.

1. Save the original number.
2. Extract the last digit using `% 10`.
3. Build the reversed number.
4. Remove the last digit using `/ 10`.
5. Compare the reversed number with the original.

### Why it works

Reversing the digits produces the number that would be read from right to left.

If the reversed number equals the original number, then the number must be a palindrome.

---

## Complexity

- Time: O(log n)
- Space: O(1)

---

## Follow-Up

An optimized solution only reverses half of the digits.

This avoids potential integer overflow and performs fewer operations.

---

## What I Learned

Modulo and integer division are useful for processing digits one at a time.

Not every palindrome problem requires converting data into a String.