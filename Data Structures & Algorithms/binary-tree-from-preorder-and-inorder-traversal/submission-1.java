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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder.length == 0){
            return null;
        }

        TreeNode root = new TreeNode();
        root.val = preorder[0];
        int inSize = inorder.length;

        int rootIndex = -1;
    
        for(int i = 0;i<inSize;i++){
            if(inorder[i] == root.val){
                rootIndex = i;
                break;
            }
        }
        int leftNo = rootIndex;
        int rightNo = inSize-1-rootIndex;

        int leftPre[] = Arrays.copyOfRange(preorder, 1, rootIndex+1);
        int leftIno[] = Arrays.copyOfRange(inorder, 0, rootIndex);

        int rightPre[] = Arrays.copyOfRange(preorder, rootIndex+1, preorder.length);
        int rightIno[] = Arrays.copyOfRange(inorder, rootIndex+1, inorder.length);

        if(leftNo >= 1){
            root.left = buildTree(leftPre,leftIno);
        }
        if(rightNo >= 1){
            root.right = buildTree(rightPre,rightIno);
        }

        return root;
        
    }
}
