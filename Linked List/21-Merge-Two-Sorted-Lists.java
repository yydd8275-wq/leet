// Problem Number: 21
// Problem Name: Merge Two Sorted Lists
// Difficulty: Easy
// Topic: Linked List, Recursion
// Problem Link: https://leetcode.com/problems/merge-two-sorted-lists/
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}