class Solution {
    public boolean checkDivisibility(int n) {
        int sol=n;
        int pro=1;
        int sum=0;
        while(n>0){
            int a=n%10;
            pro*=a;
            sum+=a;
            n/=10;
        }
        int res=pro+sum;
        if(sol%res==0) return true;
        return false;
    }
}