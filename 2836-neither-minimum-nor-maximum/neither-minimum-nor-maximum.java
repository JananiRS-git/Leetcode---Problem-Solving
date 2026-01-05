class Solution {
    public int findNonMinOrMax(int[] nums) {
        for(int i =0;i<nums.length;i++){
            if(nums.length<3) return -1;
            Arrays.sort(nums);
            if(nums.length==3) return nums[1];
            if(nums.length>3) return nums[0+1];
        }
        return 0;
    }
}