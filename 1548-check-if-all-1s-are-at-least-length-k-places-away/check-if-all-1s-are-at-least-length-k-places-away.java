class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int a=0;
        int count=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(count<k) return false;
                a+=1;
                count=0;
            }else{
                count+=1;
            }
        }
        return true;
    }
}