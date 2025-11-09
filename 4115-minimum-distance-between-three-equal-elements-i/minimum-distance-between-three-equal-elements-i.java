class Solution{
    public int minimumDistance(int[] nums){
        Map<Integer,List<Integer>>map=new HashMap<>();
        int minDist=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for(List<Integer>list:map.values()){
            if(list.size()>=3){
                for(int i=0; i<=list.size()-3;i++){
                    int a=list.get(i),b=list.get(i+1),c=list.get(i+2);
                    int dist=(b-a)+(c-b)+(c-a); 
                    minDist=Math.min(minDist, dist);
                }
            }
        }
        return(minDist==Integer.MAX_VALUE)?-1:minDist;
    }
}