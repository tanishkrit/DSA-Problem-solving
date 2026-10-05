/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        help(root, ans);
        
        return ans;
    }
    
    public void help(Node root, ArrayList<Integer> ans)
    {
        if(root == null)
        {
            return;
        }
        
        help(root.left, ans);
        help(root.right, ans);
        
        ans.add(root.data);
    }
}