// Problem Number: 61
// Problem Name: Rotate List
// Difficulty: Medium
// Topic: Linked List, Two Pointers
// Problem Link: https://leetcode.com/problems/rotate-list/
// Time Complexity: O(n³)
// Space Complexity: O(1)

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int n = 0;
        ListNode temp = head;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        k = k % n;

        while (k > 0) {
            ListNode t = head;

            while (t.next.next != null)
                t = t.next;

            ListNode last = t.next;
            t.next = null;

            last.next = head;
            head = last;

            k--;
        }

        return head;
    }
}