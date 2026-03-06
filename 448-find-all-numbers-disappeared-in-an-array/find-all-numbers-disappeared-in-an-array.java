class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int count=0;
        Set<Integer> set= new HashSet<>();
        List<Integer> res=new ArrayList<>();
        for(int n:nums){
            set.add(n);
        }
        Arrays.sort(nums);
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}