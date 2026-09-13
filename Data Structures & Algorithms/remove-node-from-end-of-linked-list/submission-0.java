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

        

        ListNode pass = reverseList(head);

        if (n == 1) {
            pass = pass.next;
        }
        else{

        

        int c = 1;
        ListNode prev = pass;
        ListNode i = pass;



        while(c <n && i!=null){
            prev = i;
            i = i.next;
            c+= 1;
        }

        prev.next = i.next;
        i.next = null;
        }

        ListNode res = reverseList(pass);
        

        return res;
        

    }
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;

        }
        if(head.next ==null){
            return head;
        }

        ListNode temp = head;
        ListNode prev = null;

        while(temp!= null){
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        head = prev;

        return head;
    }
}
