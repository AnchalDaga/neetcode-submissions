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
    int c = 0;
    int val = 0;
    public int kthSmallest(TreeNode root, int k) {

        bst(root,k);
        return val;
    }

    public void bst(TreeNode root,int k){
        if(root == null){
            return ;
        }

        bst(root.left,k);

        c++;

        if(c == k){
            val = root.val;
            return ;
        }
        
        bst(root.right,k);

    }
}
