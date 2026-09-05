/* Structure of a linked list node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) 
    {
        Node newnode = new Node(x);
        
        if(head == null)
        {
            return newnode;
        }
        
        Node temp = head;
        int count = 0;
        
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        
        temp = head;

        for(int i = 0; i < (count - 1) / 2; i++)
        {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        return head;
    }
}