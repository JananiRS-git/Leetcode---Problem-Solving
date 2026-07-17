class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums.length==1) return nums[i];
            int pro=1;
            for(int j=i;j<nums.length;j++){
                pro*=nums[j];
                max=Math.max(max,pro);
            }
        }
        return max;
    }
}