class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                first=i;
                break;
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(target==nums[j]){
                last=j;
                break;
            }
        }
        return new int[]{first,last};
    }
}