package com.samigu8.leetcode.easy.twosum;

import java.util.HashMap;

/**
 * LeetCode Problem: 1. Two Sum
 * Difficulty: Easy
 * Date Solved: 10/30/2026
 *
 * Approach:
 * Use a hash map to store the values and their indices.
 * For each element, check if the complement (target - current) exists in the map.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pairIdx = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (pairIdx.containsKey(target - num)) {
                return new int[] { pairIdx.get(target - num), i };
            }
            pairIdx.put(num, i);
        }

        throw new IllegalArgumentException("No solution found");
    }
}