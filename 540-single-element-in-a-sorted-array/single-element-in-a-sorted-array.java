class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(map.get(num)==1) ans+=num;
        }
        return ans;
    }
}