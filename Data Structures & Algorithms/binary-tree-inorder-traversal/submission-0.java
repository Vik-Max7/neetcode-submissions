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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        //LNR
        List<Integer> leftList = inorderTraversal(root.left); // left node ko add
        leftList.add(root.val);
        List<Integer> rightList = inorderTraversal(root.right); // right node ko add
        leftList.addAll(rightList);
        return leftList;
    }
}