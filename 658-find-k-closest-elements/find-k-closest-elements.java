class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list= new ArrayList<>();
        if(arr.length==1) {
            list.add(arr[0]);
            return list;
        }
        int start=0;
        int end=arr.length-1;
        while(end-start>=k){
            if(Math.abs(arr[start]-x) <= Math.abs(arr[end]-x) ){
                end--;
            }
            else start++;
        }
        for(int i=start;i<=end;i++){
            list.add(arr[i]);
        }
        return list;
    }
}