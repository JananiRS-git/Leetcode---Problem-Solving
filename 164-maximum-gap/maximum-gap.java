class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        Arrays.sort(nums);
        int diff=0;
        for(int i=0;i<nums.length-1;i++){
            int gap=nums[i+1]-nums[i];
            diff=Math.max(gap,diff);
        }
        
        return diff;
    }
}