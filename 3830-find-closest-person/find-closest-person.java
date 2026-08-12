class Solution {
    public int findClosest(int x, int y, int z) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int fir=Math.abs(x-z);
        int sec=Math.abs(y-z);
        if(fir==sec) return 0;
        else if(fir>sec) return 2;
        return 1;
    }
}