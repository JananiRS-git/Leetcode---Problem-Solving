class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int sum=0;
        int max=0;
        int min=0;
        for(int i=0;i<differences.length;i++){
            sum+=differences[i];
            min=Math.min(min,sum);
            max=Math.max(max,sum);
            if(max-min>upper-lower) {
                return 0;
            }
        }
        return (upper-lower)-(max-min)+1;
    }
}