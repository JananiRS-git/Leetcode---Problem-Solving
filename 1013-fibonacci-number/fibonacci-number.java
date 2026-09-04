class Solution {
    public int fib(int n) {
        int i=0,j=1;
        if(n==0) return 0;
        if(n==1) return 1;
        int res=0;
        for(int k=2;k<=n;k++){
            res=i+j;
            i=j;
            j=res;
        }
        return res;
    }
}