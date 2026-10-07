// Problem Number: 27
// Problem Name: Remove Element
// Difficulty: Easy
// Topic: Array, Two Pointers
// Problem Link: https://leetcode.com/problems/remove-element/
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int removeElement(int[] nums, int val) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        
        }
        return j;
    }
}