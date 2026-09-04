// Problem Number: 9
// Problem Name: Palindrome Number
// Difficulty: Easy
// Topic: Math
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
  //knkn
        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return original == reverse;
    }
}