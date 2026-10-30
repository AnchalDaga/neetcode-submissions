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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if(root == null) return "";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(sb.length()>0){
                sb.append(',');
            }
            if(node ==null){
                sb.append('n');
            }
            else{
                sb.append(node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {


        if(data == null || data.isEmpty()){
            return null;
        }

        String[] parts = data.split(",");


        TreeNode root = new TreeNode(Integer.parseInt(parts[0]));

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int i=1;

        while(!que.isEmpty() && i <parts.length){
            TreeNode parent = que.poll();

            if(i< parts.length && !parts[i].equals("n")){
                TreeNode left = new TreeNode(Integer.parseInt(parts[i]));
                parent.left = left;
                que.offer(left);
            }

            i++;
            if(i< parts.length && !parts[i].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt(parts[i]));
                parent.right = right;
                que.offer(right);
            }
            i++;   
        }

        return root;
        
    }
}
