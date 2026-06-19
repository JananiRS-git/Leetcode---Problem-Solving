class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int add=0;
        for(int i=0;i<gain.length;i++){
            add=gain[i]+add;
            max=Math.max(max,add);
        }
        int total=0;
        total=Math.max(total,max);
        return total;
    }
}