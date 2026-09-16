/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) 
    {
        // code here
        if (head == null || head.next == null) 
        {
            return null;
        }

        int count = 0;
        Node temp = head;
        
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        
        temp = head;
        
        for(int i = 0; i < (count/2) -1 ;i++)
        {
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
    }
}