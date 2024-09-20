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
class BSTIterator {
    List<Integer> l;
    TreeNode root;
    int curr;
    public BSTIterator(TreeNode root) {
        this.root=root;
        this.l=new ArrayList<>();
        this.curr=0;
        fill(root);
    }
    
    public int next() {
        return l.get(curr++);
    }
    
    public boolean hasNext() {
        if(curr>=l.size())
            return false;
        return true;
    }
    void fill(TreeNode root){
        if(root==null)
            return;
        fill(root.left);
        l.add(root.val);
        fill(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */