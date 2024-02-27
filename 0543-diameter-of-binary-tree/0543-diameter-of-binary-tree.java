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
    public int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return maxDiameter;
    }
   
    public int findDiameter(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDepth = findDiameter(root.left);
        int rightDepth = findDiameter(root.right);
        
        int curr = leftDepth + rightDepth;
        
        maxDiameter = Math.max(maxDiameter, curr);
        
        return 1 + Math.max(leftDepth, rightDepth);
    }
}