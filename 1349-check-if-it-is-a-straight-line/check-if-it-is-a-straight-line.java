class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        /*if(coordinates.length==2){
            return true;
        }
        int sum=0;
        for(int i=0;i<coordinates.length;i++){
            int total=0;
            for(int j=0;j<coordinates[i].length;j++){
                total+=coordinates[i][j];
                if(total<coordinates[i+1][j+1]) return true;
            }
        }
        return false;
        */
        if(coordinates.length==2){
            return true;
        }
        int x1=coordinates[0][0];
        int y1=coordinates[0][1];
        int x2=coordinates[1][0];
        int y2=coordinates[1][1];
        for(int i=2;i<coordinates.length;i++){
            int x3=coordinates[i][0];
            int y3=coordinates[i][1];
            if((y2-y1)*(x3-x1)!=(y1-y3)*(x1-x2)) return false;
        }
        return true;
    }
}