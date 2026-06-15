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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = size(head);
        ListNode temp = null;
        if (n == size) {
            if(head.next == null){
                return temp;
            }
            else{
                return head.next;
            }
        }

        temp = head;
        int i = 1;
        while (i < size - n && temp.next != null) {
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

        return head;
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
