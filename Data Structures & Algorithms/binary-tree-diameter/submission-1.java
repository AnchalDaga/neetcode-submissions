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
    int dia;
    public int diameterOfBinaryTree(TreeNode root) {

        postOrder(root);
        return dia;
    }

    public int postOrder(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = postOrder(root.left);
        int right = postOrder(root.right);

        int curr = Math.max(left,right)+1;

        dia = Math.max(dia,left+right);

        return curr;
    }
}
