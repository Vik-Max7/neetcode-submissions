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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode(0,temp2);
        int carry = 0;
        
        //when both list is not empty
        while (temp1 != null && temp2 != null) {
            int sum = temp2.val + temp1.val + carry;
            temp2.val = sum % 10;
            carry = sum / 10;

            dummy = dummy.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        if(temp2 == null){
            dummy.next = temp1;
        }

        //when list1 is not empty
        while (temp1 != null) {
            int sum = temp1.val + carry;
            temp1.val = sum % 10;
            carry = sum / 10;
            dummy = dummy.next;
            temp1 = temp1.next;
        }
        //when list2 is not empty
        while (temp2 != null){
            System.out.println(carry);
            int sum = temp2.val + carry;
            temp2.val = sum % 10;
            carry = sum / 10;
            dummy = dummy.next;
            temp2 = temp2.next;
        }
        //if carry is still present
        if (carry != 0) {
            dummy.next = new ListNode(1);
        }

        return l2;
    }
}
