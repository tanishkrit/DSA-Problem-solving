/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> getSortedOrder(Node root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        help(ans, root);
        return ans;
    }
    static void help(ArrayList<Integer> ans, Node root)
    {
        if(root == null)
        {
                return;
            }
            help(ans, root.left);
            ans.add(root.data);
            help(ans, root.right);
        }
    
}