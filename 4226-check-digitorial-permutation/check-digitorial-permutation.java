class Solution {
    public boolean isDigitorialPermutation(int n) {
        int rev=0;
        int temp=n;
        while(n>0){
            int a=n%10;
            int fact=1;
            for(int i=1;i<=a;i++){
                fact*=i;
            }
            rev+=fact;
            n/=10;
        }
        char[] s1=String.valueOf(rev).toCharArray();
        char[]s2=String.valueOf(temp).toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)) return true;
        return false;
    }
}