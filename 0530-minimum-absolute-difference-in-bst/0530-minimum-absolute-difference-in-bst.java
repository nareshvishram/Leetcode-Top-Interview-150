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
    TreeNode prev=null;
    int min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root==null)
            return min; 
        int a=getMinimumDifference(root.left);
        if(prev!=null)
            min=Math.min(min,root.val-prev.val);
        prev=root;
        int b=getMinimumDifference(root.right);
        return Math.min(a,Math.min(b,min));
    }
}