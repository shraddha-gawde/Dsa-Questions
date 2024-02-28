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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);

        int ans = root.val;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            ans = queue.peek().val;
            
            for(int i = 0; i < size; i++){
                TreeNode front = queue.remove();

                if (front.left != null)
                    queue.add(front.left);

                if (front.right != null)
                    queue.add(front.right);
            }
        }
        return ans;
    }
}