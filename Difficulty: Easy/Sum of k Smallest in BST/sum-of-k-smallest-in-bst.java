/* Structure of a Tree Node
class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}
*/

class Solution {
    int sum(Node root, int k) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Inorder(root, ans);
        
        int sum = 0;
        for(int i = 0; i < k; i++)
        {
            sum += ans.get(i);
        }
        
        return sum;
    }
    public void Inorder(Node root, ArrayList<Integer> ans)
    {
        if(root == null)
        {
            return;
        }
    
        Inorder(root.left, ans);
        ans.add(root.data);
        Inorder(root.right, ans);
    }
}