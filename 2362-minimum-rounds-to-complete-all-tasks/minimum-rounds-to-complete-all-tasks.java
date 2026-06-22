class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int count=0;
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i], map.getOrDefault(tasks[i],0)+1);
        }
        for(Integer num:map.values()){
            if(num<2) return -1;
            int v=(num+2)/3;
            count+=v;
        }
        return count;
    }
}