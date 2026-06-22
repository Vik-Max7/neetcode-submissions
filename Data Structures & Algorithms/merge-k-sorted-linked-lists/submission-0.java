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
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode head = null;
        
        for(int i = 1; i < lists.length; i++){
            if(i == 1){
            head = mergeTwoLists(lists[i] , lists[i-1]);
            }
            else{
                head = mergeTwoLists(lists[i],head);
            }
        }

        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;

        if(p1 == null && p2 == null){
            return p1;
        }
        else if(p1 == null){
            return p2;
        }
        else if(p2 == null){
            return p1;
        }

        ListNode dummy = new ListNode();
        ListNode head = dummy;

        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                head.next = p1;
                p1 = p1.next;
            }
            else if(p2.val < p1.val){
                head.next = p2;
                p2 = p2.next;
            }
            else{
                head.next = p2;
                p2 = p2.next;
            }
            head = head.next;
        }

        if(p1 != null){
            head.next = p1;
        }
        else if(p2 != null){
            head.next = p2;
        }

        return dummy.next;
    }
}
