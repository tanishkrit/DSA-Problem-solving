/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode temp = headA;
        ListNode temp1 = headB;

        while(temp != null)
        {
            while(temp1 != null)
            {
                if(temp == temp1)
                {
                    return temp;
                }
                temp1 = temp1.next;
            }
            temp = temp.next;

            temp1 = headB;
        }
        return null;
    }
}