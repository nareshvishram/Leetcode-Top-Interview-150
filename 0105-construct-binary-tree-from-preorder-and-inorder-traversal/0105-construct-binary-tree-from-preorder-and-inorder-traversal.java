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
    int preIdx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return bt(preorder,inorder,0,preorder.length-1);
    }
    private TreeNode bt(int[] pre,int in[],int start,int end){
        if(preIdx>=pre.length || start>end )
            return null;
        TreeNode nn=new TreeNode(pre[preIdx++]);
        if(start==end)
            return nn;
        int rootIdx=findRootIndex(in,start,end,nn.val);
        nn.left=bt(pre,in,start,rootIdx-1);
        nn.right=bt(pre,in,rootIdx+1,end);
        return nn;
    }
    private int findRootIndex(int in[],int start,int end,int key){
        for(int i=0;i<=end;i++)
            if(in[i]==key)
                return i;
        return -1;
    }
}