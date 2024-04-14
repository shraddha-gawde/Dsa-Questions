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
    public int sumOfLeftLeaves(TreeNode root) {
        return find_val(root,1);
    }
    public static int find_val(TreeNode root,int flag){
        if(root==null) return 0;
        if(flag==0&&root.right==null&&root.left==null) return root.val;
        return find_val(root.left,0)+find_val(root.right,1); 
    }
}