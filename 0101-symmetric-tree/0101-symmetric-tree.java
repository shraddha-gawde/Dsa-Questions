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

    private boolean symmetricHelper(TreeNode left, TreeNode right){
        
        if(left==null || right==null){
            return left==right;
        }

        if(left.val!=right.val)return false;

        return symmetricHelper(left.left, right.right) && symmetricHelper(left.right,right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return root==null || symmetricHelper(root.left,root.right);
    }
}