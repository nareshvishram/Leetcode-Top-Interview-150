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
    int postIdx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        postIdx=n-1;
        return bt(inorder,postorder,0,n-1);
    }
    private TreeNode bt(int in[],int post[],int start,int end){
        if(postIdx<0 || start>end)
            return null;
        TreeNode nn=new TreeNode(post[postIdx--]);
        System.out.println(nn.val);
        if(start==end)
            return nn;
        int rootIdx=findRootIndex(in,start,end,nn.val);
        //System.out.println(rootIdx+" "+nn.val+" "+start+" "+end+" "+postIdx);
        nn.right=bt(in,post,rootIdx+1,end);
        nn.left=bt(in,post,start,rootIdx-1);
        return nn;
    }
    private int findRootIndex(int in[],int start,int end,int key){
        for(int i=0;i<=end;i++)
            if(in[i]==key)
                return i;
        return -1;
    }
}