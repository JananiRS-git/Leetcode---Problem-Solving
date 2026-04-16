class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        while(n>0){
            int a=n%10;
            pro*=a;
            sum+=a;
            n/=10;
        }
        return pro-sum; 
    }
}