class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<2) return 0;
        int count=0,first=0,second=0;
        for(int i=0;i<nums.length-2;i++){
            first=nums[i+1]-nums[i];
            for(int j=i+2;j<nums.length;j++){
                second=nums[j]-nums[j-1];
                if(first==second) count++;
                else break;
            }
        }
        return count;
    }
}