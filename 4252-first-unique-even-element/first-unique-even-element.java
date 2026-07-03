class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer, Integer> map= new LinkedHashMap<>();
        for(int res:nums){
            map.put(res, map.getOrDefault(res,0)+1);
        }
        //int ans=-1;
        for(Map.Entry<Integer, Integer> res: map.entrySet()){
            if(res.getValue()==1){
                if(res.getKey()%2==0) return res.getKey();
            }
        }
        return -1;
    }
}