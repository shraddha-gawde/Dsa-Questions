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
    
    String result = "";
    
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        return result;
    }
    private void dfs(TreeNode node, String suffix) {
        
        if (node == null){
            return;
        } 
        suffix = (char)('a' + node.val) + suffix;
        
        if (node.left == null && node.right == null) {
            if (result.isEmpty() || result.compareTo(suffix) > 0) {
                result = suffix;
            }
        }
        if(node.left != null) {
            dfs(node.left, suffix);
        }
        if(node.right != null) {
            dfs(node.right, suffix);
        }
    }
}