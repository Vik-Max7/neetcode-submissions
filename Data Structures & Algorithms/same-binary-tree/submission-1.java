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
        if(p == null && q == null){
            return true;
        }
        else if(p == null || q == null || p.val != q.val){
            return false;
        }

       boolean lTree = isSameTree(p.left,q.left);
       boolean rTree = isSameTree(p.right,q.right);
       
       return lTree == true  && rTree == true ? true : false;
    }
}
