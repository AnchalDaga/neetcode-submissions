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
    public TreeNode invertTree(TreeNode root) {

        swapTrees(root);

        

        return root;

    }

    public TreeNode swapTrees(TreeNode root){

        if(root == null) return null;
        

        TreeNode left = swapTrees(root.left);
        TreeNode right = swapTrees(root.right);
        
        TreeNode temp = left;
        root.left = root.right;

        root.right = temp;

        return root;
    }
}
