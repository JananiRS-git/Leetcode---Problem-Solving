class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            int res=0;
            for(int j=i+1;j<nums.size();j++){
                res=nums.get(i)+nums.get(j);
                if(res<target){
                    count++;
                }
            }
        }
        return count;
    }
}