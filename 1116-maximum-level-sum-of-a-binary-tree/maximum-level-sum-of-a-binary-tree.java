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
    public int maxLevelSum(TreeNode root) {
       /* if(root==null) return 0;
        int max=Integer.MAX_VALUE;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        int level=1;
        max=root.val;
        while(!q.isEmpty()){
            int size=q.size();
            TreeNode cur=q.poll();
            for(int i=0;i<size;i++){
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
                int sum=cur.left.val+cur.right.val;
                max=Math.max(sum,max);
                if(max==sum) level++;
            }
        }
        return level;*/
        Queue<TreeNode> q= new LinkedList<>();
        int max=Integer.MIN_VALUE;
        int level=0;
        int l=0;
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
            int sum=0;
            int size=q.size();
            level++;
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                sum+=cur.val;
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            if(sum>max){
                max=sum; 
                l=level;   
            }
        }
        return l;
    }
}