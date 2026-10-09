// Problem Number: 119
// Problem Name: Pascal's Triangle II
// Difficulty: Easy
// Topic: Array, Dynamic Programming
// Problem Link: https://leetcode.com/problems/pascals-triangle-ii/
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);

            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}