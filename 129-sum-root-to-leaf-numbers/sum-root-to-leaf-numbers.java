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
    public int sum=0;
    public int res=0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        ans(root,0);
        return res;
    }

    public void ans(TreeNode root,int sum){
        if(root.left==null && root.right==null){
            sum=sum*10+root.val;
            res+=sum;
        }
        if(root.left!=null){
            ans(root.left,sum*10+root.val);
        }
        if(root.right!=null){
            ans(root.right,sum*10+root.val);
        }
    }       
}