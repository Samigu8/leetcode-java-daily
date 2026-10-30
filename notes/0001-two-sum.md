# Two Sum

## Problem

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

You may assume that each input has exactly one solution, and you may not use the same element twice.

---

## Initial Thoughts

The brute force solution is to compare every number with every other number.

This works but requires nested loops, which is inefficient for large inputs.

---

## Solution

### Approach

Use a HashMap to store previously seen values and their indices.

For each number:

1. Compute the complement:
    
    complement = target - nums[i]

2. Check if the complement already exists in the HashMap.

3. If it does, return both indices.

4. Otherwise, add the current number and index to the HashMap.

### Why it works

For every number, we immediately know the value needed to reach the target.

The HashMap provides O(1) lookup time, allowing us to find the matching number without scanning the array again.

---

## Complexity

- Time: O(n)
- Space: O(n)

---

## What I Learned

HashMaps are useful for trading extra memory for faster lookups.

Many array interview questions can be optimized by storing previously seen values in a HashMap.