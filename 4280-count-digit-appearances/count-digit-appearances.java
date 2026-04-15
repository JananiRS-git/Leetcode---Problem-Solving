class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int res=0;
        for(int i:nums){
            while(i>0){
                int lastdigit=i%10;
                if(lastdigit==digit) res++;
                i/=10;
            }
        }
        return res;    
    }
}