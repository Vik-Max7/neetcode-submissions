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
    int dia = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int lHeight = maxDepth(root.left);
        int rHeight = maxDepth(root.right);
        int currMaxDia = lHeight + rHeight +2;
        dia = Math.max(dia,currMaxDia);
        int lDia = diameterOfBinaryTree(root.left);
        int rDia = diameterOfBinaryTree(root.right);

        return dia;
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return -1;
        }

        int lHeight = maxDepth(root.left);
        int rHeight = maxDepth(root.right);

        int max = Math.max(lHeight,rHeight) + 1;
        return max;
    }
}
