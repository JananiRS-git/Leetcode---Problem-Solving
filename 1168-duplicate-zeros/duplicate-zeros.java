class Solution {
    public void duplicateZeros(int[] arr) {
        int res[]=new int[arr.length];
        int zero=0;
        for(int i=0;i<arr.length && zero<arr.length;i++){
            if(arr[i]==0){
                res[zero]=0;
                zero++;
                if(zero<arr.length){
                    res[zero]=0;
                    zero++;
                }
            }else{
                res[zero]=arr[i];
                zero++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        }
    }
}