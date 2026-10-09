// Problem Number: 17
// Problem Name: Letter Combinations of a Phone Number
// Difficulty: Medium
// Topic: Hash Table, String, Backtracking
// Problem Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    String[] map = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return ans;

        backtrack(digits, 0, "");

        return ans;
    }

    void backtrack(String digits, int index, String current) {
        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            backtrack(digits, index + 1, current + letters.charAt(i));
        }
    }
}