// Problem Number: 26
// Problem Name: Remove Duplicates from Sorted Array
// Difficulty: Easy
// Topic: Array, Two Pointers
// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {

        int j = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}