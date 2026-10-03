// Problem Number: 594
// Problem Name: Longest Harmonious Subsequence
// Difficulty: Easy
// Topic: Array, Hash Table, Sliding Window, Sorting, Counting
// Problem Link: https://leetcode.com/problems/longest-harmonious-subsequence/



class Solution {
    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;

        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                max = Math.max(max, map.get(num) + map.get(num + 1));
            }
        }

        return max;
    }
}