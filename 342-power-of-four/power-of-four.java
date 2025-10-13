class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n<=0) return false;
        for(int x = 1;x<=31;x++){
            if(n%4==0 && (n==(int)Math.pow(4,x))) return true;
        }
        return false;
    }
}