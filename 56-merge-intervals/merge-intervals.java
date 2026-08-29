class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> mer=new ArrayList<>();
        int[] curr= intervals[0];
        mer.add(curr);
        for(int[] nextInt: intervals){
            int currend=curr[1];
            int start=nextInt[0];
            int end=nextInt[1];
            if(start<=currend){
                curr[1]=Math.max(currend,end);
            }
            else{
                curr=nextInt;
                mer.add(curr);
            }
        }
        return mer.toArray(new int[mer.size()][]);
    }
}