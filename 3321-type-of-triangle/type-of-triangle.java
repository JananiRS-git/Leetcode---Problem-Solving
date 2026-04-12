class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> a=new HashSet<>();
        for(int num:nums){
            a.add(num);
        }
        if(nums[0]+nums[1]<=nums[2]) return "none";
        if(a.size()==1) return "equilateral";
        if(a.size()==2) return "isosceles";
        return "scalene";
    }
}