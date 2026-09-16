/*
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) 
    {
        Node temp = head;
        
        while(temp != null)
        {
            if(temp.next == head)
            {
                return true;
            }
            temp = temp.next;
        }
        
        return false;
    
    
    }
}