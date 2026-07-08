class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            int size=list.size();
            if(size<2||num!=list.get(size-2)){
                list.add(num);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }
}