class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int res=k;
        while(set.contains(res)){
            res+=k;
        }
        return res;
    }
}