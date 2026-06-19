class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        int ecount=0;
        for(int num:nums1){
            if(num<min) min=num;
            if(num%2==0) ecount++;
        }
        int n=nums1.length;
        boolean alleven=(ecount==n);
        boolean ismin=(min%2==1);
        return alleven || ismin;
    }
}