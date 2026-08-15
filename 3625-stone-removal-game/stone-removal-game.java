class Solution {
    public boolean canAliceWin(int n) {
        int count=10;
        boolean flag=false;
        while(n>=count){
            n-=count;
            count--;
            flag=!flag;
        }
        return flag;
    }
}