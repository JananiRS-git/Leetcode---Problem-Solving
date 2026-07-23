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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;// here return 0 as ques asks with no.of nodes if ques with edge then--> return -1
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return (Math.max(left,right))+1;   
    }
}