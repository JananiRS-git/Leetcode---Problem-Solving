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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        return ans(root)!=-1;
    }
    public int ans(TreeNode root){
        if(root==null) return 0;
        int leftheight= ans(root.left);
        if(leftheight==-1) return -1;
        int rightheight= ans(root.right);
        if(rightheight==-1) return -1;
        int ans= Math.abs(leftheight-rightheight);
        if(ans>1) return -1;
        return 1+Math.max(leftheight,rightheight);
    }
}