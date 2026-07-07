class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long rem=0;
        long d=1;
        while(n>0) {
            long digit=(long)n%10;
            if(digit!=0) {
                sum+=digit;
                rem+=digit*d;
                d*=10;
            }
            n/=10;
        }
        return rem*sum;
    }
}