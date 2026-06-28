class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        int res=max;
        for(int j=k;j<nums.length;j++){
            max+=nums[j] - nums[j-k];
            res=Math.max(max,res);
        }
        double avg=(double)res/k;
        return avg;
    }
}