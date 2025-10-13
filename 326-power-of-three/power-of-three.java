class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        for(int x = 1;x<=31;x++){
            if(n%3==0){
                if(n==(int)Math.pow(3,x)) return true;
            }
        }
        return false;
    }
}