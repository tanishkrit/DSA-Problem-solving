/* Linked List Node Structure
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public static int getLength(Node head) 
    {
        // code here
        if(head == null)
        {
            return 0;
        }
        
        int count = 0;
        Node temp = head;
        
        while(temp.next != head)
        {
            count++;
            temp = temp.next;
        }
        
        return count + 1;
    }
}