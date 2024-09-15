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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int itr=0;
        Stack<TreeNode> st=new Stack<>();
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            itr++;
            while(size-->0)
            {
                TreeNode tmp=q.poll();
                l.add(tmp.val);
                if(itr%2!=0)
                {
                    if(tmp.left!=null)
                        st.add(tmp.left);
                    if(tmp.right!=null)
                        st.add(tmp.right);
                }
                else
                {
                     if(tmp.right!=null)
                        st.add(tmp.right);
                    if(tmp.left!=null)
                        st.add(tmp.left);
                }
            }
            while(!st.isEmpty())
                q.add(st.pop());
            res.add(l);
           // itr++;
        }
        return res;
    }
}