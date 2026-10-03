// Problem Number: 2
// Problem Name: Add Two Numbers
// Difficulty: Medium
// Topic: Linked List
// Problem Link: https://leetcode.com/problems/add-two-numbers/
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;
 //rftttg
        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            } 

            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }
}