class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count=0;
        int prev=nums[0];
        for(int i=0;i<nums.length;i++){
            if(prev<=nums[i]) {
                count++;
                prev=nums[i];
            }
            
        }
        return count;
    }
}