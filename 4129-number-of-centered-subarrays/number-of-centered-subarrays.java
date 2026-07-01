class Solution {
    public int centeredSubarrays(int[] nums) {
        int n=nums.length;
        int count=0;
        /*List<Integer> list= new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j]; 
                if(list.subList(i,j+1).contains(sum)) count++;
            }
        }
        return count;*/
        for(int i=0;i<n;i++){
            Set<Integer> set= new HashSet<>();
            int sum=0;
            for(int j=i;j<n;j++){
                set.add(nums[j]);
                sum+=nums[j];
                if(set.contains(sum)) count++;
            }
        }
        return count;
    }
}