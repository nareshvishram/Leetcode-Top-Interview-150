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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return root.val;
        helper(root);
        return ans;
    }
    private int helper(TreeNode root){
        if(root==null)
            return 0;
        int l=helper(root.left);
        int r=helper(root.right);
        int maxLR=Math.max(l,r);
        ans=Math.max(Math.max(r+l+root.val,Math.max(maxLR+root.val,root.val)),ans);
        return Math.max(maxLR+root.val,root.val);
    }
}