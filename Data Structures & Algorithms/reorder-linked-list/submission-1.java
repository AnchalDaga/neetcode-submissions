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

        if(head == null || head.next == null){
            return ;
        } 

        ListNode slow = head; //head of 2nd half
        ListNode fast = head; //tail of 2nd half
        ListNode prev = null; // tail of 1st half
        ListNode l1 = head; //head of 1st half

        //find mid point using floyd (hare-tortoise)
        while(fast != null && fast.next!=null ){

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null; //tail of 1st, points to null

        //reverse 2nd half

        ListNode temp = slow;
        ListNode before = null;

        while(temp!= null){
            ListNode newNext = temp.next;
            temp.next = before;
            before = temp;
            temp = newNext;
        }
        slow = before;

        //merge two linked lists

        ListNode res = new ListNode(Integer.MIN_VALUE);

        ListNode i = res;

        while(l1!=null && slow !=null){
            i.next = l1;
            i = i.next;
            l1 = l1.next;

            i.next = slow;
            i = i.next;
            slow = slow.next;
        }

        if(l1 !=null){
            i.next = l1;
        }
        else{
            i.next = slow;
        }
        



        
    }
}
