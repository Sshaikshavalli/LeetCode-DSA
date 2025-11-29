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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> qp=new LinkedList<>();
        Queue<TreeNode> qq=new LinkedList<>();

        qp.add(p);
        qq.add(q);

        while(!qp.isEmpty() && !qq.isEmpty()) {
            TreeNode tp=qp.poll();
            TreeNode tq=qq.poll();

            if(tp==null && tq==null) 
            continue;
            if(tp==null || tq==null) 
            return false;
            if(tp.val !=tq.val) 
            return false;

            qp.add(tp.left);
            qq.add(tq.left);
            qp.add(tp.right);
            qq.add(tq.right);;
        }
        return qp.isEmpty() && qq.isEmpty();
        
    }
}