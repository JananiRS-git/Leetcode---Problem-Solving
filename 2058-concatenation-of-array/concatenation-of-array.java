class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] n=new int[nums.length*2];
        /*for(int i=0;i<n.length;i++){
            n[i]=nums[i%nums.length]; --> [nums[0%3]]-->nums[0]-->n[0]=nums[0];
        }*/
        for(int i=0;i<len;i++){
            n[i]=nums[i]; //first half --> [1,_,_,_,_,_]
            n[i+len]=nums[i]; //second half --> [1,_,_,1,_,_,]
        }
        return n;
    }
}