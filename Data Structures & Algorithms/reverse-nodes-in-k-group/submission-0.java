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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 1;
        ListNode end = head;
        ListNode start = head;
        ListNode prevGroup = null;

        while (start != null) {

            while(count < k && end.next!= null){
                count+=1;
                end = end.next;
            }
            if(count ==k){
                ListNode nextGroup = end.next;

                ListNode newHead = reverseList(start,end);
                if(start==head){
                    head = newHead;
                }
                else{
                    prevGroup.next = newHead;
                }
                start.next = nextGroup;

                prevGroup = start;
                start = nextGroup;
                end = nextGroup;
                count = 1;
            }
            else{
                break;
            } 
        }
        return head;
    }

    private ListNode reverseList(ListNode head, ListNode end) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        curr.next = prev;

        return curr;
    }
}
