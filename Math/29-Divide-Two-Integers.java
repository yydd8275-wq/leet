// Problem Number: 29
// Problem Name: Divide Two Integers
// Difficulty: Medium
// Topic: Math, Bit Manipulation
// Problem Link: https://leetcode.com/problems/divide-two-integers/
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int ans = 0;

        while (a >= b) {
            long temp = b;
            int count = 1;

            while (a >= (temp << 1)) {
                temp <<= 1;
                count <<= 1;
            }

            a -= temp;
            ans += count;
        }

        if ((dividend < 0) ^ (divisor < 0))
            return -ans;
//khhdb
        return ans;
    }
}