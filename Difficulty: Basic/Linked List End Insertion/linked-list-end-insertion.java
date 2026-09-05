/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) 
    {
        Node newNode = new Node(x);
        
        if (head == null) {
            return newNode;
        }
        
        Node temp = head;
        
        // Reach the last node
        while (temp.next != null) {
            temp = temp.next;
        }
        
        // Attach new node
        temp.next = newNode;
        
        return head;

    }
}