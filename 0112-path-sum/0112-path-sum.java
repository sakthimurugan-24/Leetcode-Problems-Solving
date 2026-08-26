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
 *         thi
 */
class Solution {
    public boolean hpath(TreeNode root,int targetSum){
         if(root==null) return false;

        if(root.left==null && root.right==null && root.val==targetSum) return true;

        targetSum-=root.val;
        return hpath(root.left,targetSum) || hpath(root.right,targetSum);
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return hpath(root,targetSum);

       
    }
}