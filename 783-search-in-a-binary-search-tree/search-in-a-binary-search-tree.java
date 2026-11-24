/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public TreeNode searchBST(TreeNode root, int val)
    {
        if(root == null || root.val == val)
        {
            return root;
        }

        if(root.val > val)
        {
            return searchBST(root.left, val);
        }
        else
        {
            return searchBST(root.right, val);
        }
    }

    public void printTree(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.val + " ");

        printTree(root.left);
        printTree(root.right);
    }
}
