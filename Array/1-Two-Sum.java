// Problem Number: 1
// Problem Name: Two Sum
// Difficulty: Easy
// Topic: Array, Hash Table
// Problem Link: https://leetcode.com/problems/two-sum/
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}