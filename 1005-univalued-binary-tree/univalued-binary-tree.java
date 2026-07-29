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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        List<Integer> list= new ArrayList<>();
        ans(root,list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)!=(list.get(i+1))) return false; 
        }
        return true;
    }
    public void ans(TreeNode root, List<Integer> list){
        if(root==null) return ;
        list.add(root.val);
        ans(root.left, list);
        ans(root.right, list);
    }
}