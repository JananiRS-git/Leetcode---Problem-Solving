class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int fre=0;
        int max=-1;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getKey()%2==0){
                if(e.getValue()>fre){
                    fre=e.getValue();
                    max=e.getKey();
                }else if(e.getValue()==fre && e.getKey()<max){
                    max=e.getKey();
                }
            }
        }
        return max;
    }
}