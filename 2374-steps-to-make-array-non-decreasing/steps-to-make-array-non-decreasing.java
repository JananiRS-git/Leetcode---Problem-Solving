class Solution {
    public int totalSteps(int[] nums) {
        int step=0;
        int[] dp= new int[nums.length];
        Stack<Integer> stack= new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                int pop=stack.pop();
                dp[i]=Math.max(dp[i]+1, dp[pop]);
            }
            stack.push(i);
            step= Math.max(step,dp[i]);
        }
        return step;
    }
}