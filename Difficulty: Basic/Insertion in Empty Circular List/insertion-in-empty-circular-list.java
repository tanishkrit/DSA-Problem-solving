/*class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public Node insertIntoEmpty(Node last, int data) 
    {
        // code here
        
        Node head;    
        Node newnode = new Node(data);
        
        head = newnode;
        head.next = head;
        
        return head;
    }
}
