class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        int res=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]>coins){
                i++;
            }
            else{
                res+=costs[i];
                if(res>coins){
                    res-=costs[i];
                    count--;
                }
                count++;
            }
        }
        //if(res==coins) return count;
        //if(res<coins) return costs.length;
        return count;
    }
}