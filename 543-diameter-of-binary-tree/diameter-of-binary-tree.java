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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        ans(root);
        return diameter;
    }
    public int ans(TreeNode root){
        if(root==null) return 0;
        int left_h=ans(root.left);
        int right_h=ans(root.right);
        diameter=Math.max(diameter,left_h+right_h);
        return 1+Math.max(left_h,right_h);
    }
}