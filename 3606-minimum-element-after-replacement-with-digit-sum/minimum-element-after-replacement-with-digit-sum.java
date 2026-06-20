class Solution {
    public int minElement(int[] nums) {
        int[] arr=new int[nums.length];
         int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
            int a=nums[i]%10;
            sum+=a;
            nums[i]/=10;
            }
            min=Math.min(min,sum);
            arr[i]=sum;
        }
        return min;
    }
}