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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
       List<Double> res=new ArrayList<>();
      if(root==null)
        return res;
     
      q.add(root);
      
      while(!q.isEmpty())
      {
        long size=q.size();
        long gSize=q.size();
        long  sum=0;
        double avg=0.0;
        while(size-->0)
        {
          TreeNode tmp=q.poll();
          sum+=tmp.val;
          if(tmp.left!=null)
            q.add(tmp.left);
          if(tmp.right!=null)
            q.add(tmp.right);
          
        }
        if(sum%gSize==0)
          avg=sum/gSize;
        else
        avg=sum/(1.0*gSize);
        res.add(avg);
      }
      return res;
    }
}