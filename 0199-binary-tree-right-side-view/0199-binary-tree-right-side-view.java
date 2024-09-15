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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        q.add(root);
        while(true){
            int nodes=q.size();
            //System.out.println(nodes);
            if(nodes==0)
                break;
            while(nodes>0){
                TreeNode curr=q.poll();
                //System.out.println(nodes+" "+curr.val);
                if(nodes==1)
                    ans.add(curr.val);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
                nodes--;
            }
        }
        
        return ans;
    }
}