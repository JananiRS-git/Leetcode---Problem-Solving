class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int pro=0;
        int a=nums.length;   
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                pro=Math.max((nums[i]-1)*(nums[j]-1),pro);
            }
        }return pro;
    }
}