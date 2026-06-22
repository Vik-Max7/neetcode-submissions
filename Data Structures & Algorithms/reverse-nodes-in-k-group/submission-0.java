/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupTail = dummy;
        ListNode groupHead = head;

        while (groupHead != null) {

            ListNode kthNode = getKthNode(groupHead, k);

            if (kthNode == null) {
                break;
            }

            ListNode nextGroupHead = kthNode.next;

            // Disconnect current group
            kthNode.next = null;

            // Reverse current group
            ListNode[] reversed = reverse(groupHead);

            // Connect previous group to new head
            prevGroupTail.next = reversed[0];

            // Connect new tail to next group
            reversed[1].next = nextGroupHead;

            // Move pointers for next iteration
            prevGroupTail = reversed[1];
            groupHead = nextGroupHead;
        }

        return dummy.next;
    }

    public ListNode getKthNode(ListNode head, int k) {

        ListNode temp = head;

        while (temp != null && k > 1) {
            temp = temp.next;
            k--;
        }

        return temp;
    }

    public ListNode[] reverse(ListNode head) {

        ListNode tail = head;
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return new ListNode[]{prev, tail};
    }
}