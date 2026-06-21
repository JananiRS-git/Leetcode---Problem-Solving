class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j]; 
                String s= Long.toString(sum);
                if(s.charAt(0)==s.charAt(s.length()-1) && Integer.parseInt(s.charAt(0)+"")==x) count++;
            }
        }
        return count;
    }
}