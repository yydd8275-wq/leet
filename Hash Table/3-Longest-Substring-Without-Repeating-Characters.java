// Problem Number: 3
// Problem Name: Longest Substring Without Repeating Characters
// Difficulty: Medium
// Topic: Hash Table
// Problem Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        int[] arr = new int[128];

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
//ljgfhhj
            arr[c]++;

            while (arr[c] > 1) {
                arr[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}