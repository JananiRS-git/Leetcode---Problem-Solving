class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res= new int[n][n];
        int left=0;
        int right=n-1;
        int bottom=n-1;
        int top=0;
        int num=1;
        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                res[top][j]=num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res[i][right]=num++;
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    res[bottom][j]=num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res[i][left]=num++;
                }
                left++;
            }
        }
        return res;
    }
}