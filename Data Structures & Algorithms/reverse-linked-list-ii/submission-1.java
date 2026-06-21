/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode itr = dummy;
        int i = 0;

        // at before left node
        while (i < left - 1) {
            itr = itr.next;
            i++;
        }

        // at after ight node
        i = 1;
        ListNode remList = head;
        while (i <= right) {
            remList = remList.next;
            i++;
        }

        // reverse
        ListNode[] headTail = reverse(itr.next, right - left);

        if (left == 1) {
            head = headTail[0];
        } else {
            itr.next = headTail[0];
        }

        headTail[1].next = remList;

        return head;
    }

    public ListNode[] reverse(ListNode head, int right) {
        ListNode tail = head;
        ListNode prev = null;
        ListNode curr = head;
        int i = 0;
        while (i <= right) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            i++;
        }
        System.out.println(prev.val + "--" + tail.val);
        return new ListNode[] {prev, tail};
    }
}