class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int size=nums.length/3;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>size){
                res.add(e.getKey());
            }
        }
        return res;
    }
}