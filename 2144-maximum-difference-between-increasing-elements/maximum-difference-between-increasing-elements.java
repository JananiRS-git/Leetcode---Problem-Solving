class Solution {
    public int maximumDifference(int[] nums) {
        int sub=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    sub=nums[j]-nums[i];
                }
                if(sub>max) max=sub;
            }
        }
        return max;
    }
}