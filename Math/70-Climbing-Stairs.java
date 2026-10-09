// Problem Number: 70
// Problem Name: Climbing Stairs
// Difficulty: Easy
// Topic: Math, Dynamic Programming, Memoization
// Problem Link: https://leetcode.com/problems/climbing-stairs/
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;

        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}