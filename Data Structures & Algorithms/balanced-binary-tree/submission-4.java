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
    public boolean isBalanced(TreeNode root) {



        int val = getDepth(root);
        return val != -1;



        
    }

    public int getDepth(TreeNode root){
        if(root == null) return 0;

        int depth = 0;


        int l = getDepth(root.left);

        int r = getDepth(root.right);

        if(Math.abs(l - r)>1){
            return -1 ;
        }
        else if( l == -1 || r ==-1){
            return -1;
        }
        else{
            depth = Math.max(l,r) +1;
        }

        return depth;
    }
}
