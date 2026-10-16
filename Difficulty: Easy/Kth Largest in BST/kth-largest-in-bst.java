/* Structure of a Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public int kthLargest(Node root, int k) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
    
        inorder(root, ans);
    
        return ans.get(ans.size() - k);
    }
    
    public void inorder(Node root, ArrayList<Integer> ans) 
    {
        if (root == null) 
        {
            return;
        }
    
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }
}