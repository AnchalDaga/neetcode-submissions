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

    Integer prev = null;
    public boolean isValidBST(TreeNode root) {


        return bst(root);
        
    }
    public boolean bst(TreeNode node){

        if(node == null){
            return true;
        }

        if(bst(node.left) == false){
            return false;
        }

        if(prev != null && prev>= node.val){
            return false;
        }

        prev = node.val;

        if(bst(node.right)==false){
            return false;
        }

        return true;
    }
}
