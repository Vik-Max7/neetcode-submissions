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
    public void reorderList(ListNode head) {
        // n / 2 times hoga middle mai add krne wala kaam
        if (head == null || size(head) < 3) {
            return;
        }
        int lSize = size(head);
        //System.out.println(lSize);
        int addLastOpTime = lSize / 2;
        
        int i = 1;
        ListNode curr = head;
        while (i <= addLastOpTime) {
            ListNode lNode = getLast(head);
            ListNode post = curr.next;
            // System.out.println(post.val);
            curr.next = lNode;
            lNode.next = post;
            curr = post;
            i++;
        }
    }

    public ListNode getLast(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp;
    }

    public int size(ListNode head) {
        ListNode temp = head;
        int size = 1;

        while (temp.next != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }
}
