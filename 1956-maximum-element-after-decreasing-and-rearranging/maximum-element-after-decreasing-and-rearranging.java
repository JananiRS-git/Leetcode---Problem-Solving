class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0]=1;
        if(arr.length==1) return arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                if(arr[i-1]-arr[i-1]!=1){
                    arr[i]= arr[i-1]+1;
                }
            }
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}