/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {

        Node temp = head;
        Node temp1 = head;

        // Move temp k nodes ahead
        for(int i = 0; i < k; i++)
        {
            if(temp == null)
                return -1;

            temp = temp.next;
        }

        // Move both pointers together
        while(temp != null)
        {
            temp = temp.next;
            temp1 = temp1.next;
        }

        return temp1.data;
    }
}