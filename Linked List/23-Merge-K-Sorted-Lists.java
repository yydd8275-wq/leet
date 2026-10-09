// Problem Number: 23
// Problem Name: Merge k Sorted Lists
// Difficulty: Hard
// Topic: Linked List, Divide and Conquer, Heap (Priority Queue), Merge Sort, Tournament Sort
// Problem Link: https://leetcode.com/problems/merge-k-sorted-lists/
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            current.next = node;
            current = current.next;

            if (node.next != null) {
                pq.add(node.next);
            }
        }
//sdef
        return dummy.next;
    }
}