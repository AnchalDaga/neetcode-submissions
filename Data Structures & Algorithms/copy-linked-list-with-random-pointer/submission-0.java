/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head == null) return null;


        //create a list with same val, add a new node in middle
        Node curr = head;       
        while(curr!=null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        //get random val and assign

        curr = head;

        while(curr!=null){
            if(curr.random !=null){
                curr.next.random = curr.random.next; 
            }
            curr = curr.next.next;
        }

        //divide the two list

        curr = head;
        Node newHead = curr.next;
        Node result = newHead;

        while(curr !=null){
            curr.next = newHead.next;
            curr = curr.next;
            if(curr!=null){
                newHead.next = curr.next;
                newHead = newHead.next;
            }
        }





        return result;


        
    }
}
