// Problem Number: 14
// Problem Name: Longest Common Prefix
// Difficulty: Easy
// Topic: Array, String, Trie
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}