class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=(int)nums.length/2;
        int res=nums[mid];
        int first=0,second=0;
        for(int i=0;i<mid;i++){
           first+=Math.abs(res-nums[i]);
        }
        for(int i=mid;i<nums.length;i++){
            second+=Math.abs(nums[i]-res);
        }
        return first+second;
    }
}