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
    public boolean isPalindrome(ListNode head) 
    {
        ArrayList<Integer> ans = new ArrayList<>();

        ListNode temp = head;

        while(temp != null)
        {
            ans.add(temp.val);
            temp = temp.next;
        }

        temp = head;

        for(int i = ans.size() - 1; i >= 0; i--)
        {
            if(temp.val != ans.get(i))
            {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }
}