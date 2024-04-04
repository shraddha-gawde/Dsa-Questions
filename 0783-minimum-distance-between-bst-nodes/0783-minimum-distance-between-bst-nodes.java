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
    public int minDiffInBST(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        inOrderTraversal(root, list);
        int min=Integer.MAX_VALUE;
        for(int i=0; i<list.size()-1; i++){
            min= Math.min(min, list.get(i+1)-list.get(i));
        }
        return min;
        
    }
    public void inOrderTraversal(TreeNode root, List<Integer> list){
        if(root==null) return;
        inOrderTraversal(root.left, list);
        list.add(root.val);
        inOrderTraversal(root.right, list);
    }
}