class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        /*Set<Integer> set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        int res=nums1.length;
        for(int i=0;i<nums2.length-1;i++){
            if(set.contains(nums2[i])){
                if(nums2[i]<nums2[i+1]) res=nums2[i+1];
                else res=-1;
            }
        }
        return new int[]{res};*/
        /*int res=nums1.length;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    res=nums2[j];
                }
                else res=-1;
            }
        }
        return new int[]{res};*/
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[j]<nums2[k]){
                            res[i]=nums2[k];
                            break;
                        }
                    }
                }
            }
        }
        return res;
    }
}