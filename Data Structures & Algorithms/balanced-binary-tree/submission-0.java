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
    class Pair{
        int height;
        boolean balanced;

        Pair(){

        }

        Pair(int height, boolean balanced){
            this.height = height;
            this.balanced = balanced;
        }
    }


    public boolean isBalanced(TreeNode root) {
         Pair ans = helperBalanced(root);
         return ans.balanced;
    }

    public Pair helperBalanced(TreeNode root){
        if(root == null){
            Pair bPair = new Pair(0,true);
            return bPair;
        }

       Pair lPair = helperBalanced(root.left);
       Pair rPair = helperBalanced(root.right);

       if(lPair.balanced == false || rPair.balanced == false){
        Pair nBp = new Pair(0,false);
        return nBp;
       }

       Pair mPair = new Pair();
       mPair.height = Math.max(lPair.height,rPair.height) + 1;
       mPair.balanced = Math.abs(lPair.height - rPair.height) <= 1 ? true : false;
       
       return mPair;
    }
}
