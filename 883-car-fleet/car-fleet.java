class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int[][] car= new int[n][2];
        for(int i=0;i<n;i++){
            car[i][0] = position[i];
            car[i][1] = speed[i];
        }
        Arrays.sort(car,(a,b)->Integer.compare(a[0],b[0]));
        int count=0;
        double max=-1;
        for(int i=n-1;i>=0;i--){
            double time=(double)(target-car[i][0])/car[i][1];
            if(time>max){
                count++;
                max=time;
            } 
        }
        return count;
    }
}