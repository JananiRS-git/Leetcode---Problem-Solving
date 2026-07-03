class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        /*List<List<Integer>> res= new ArrayList<>();
        Map<Integer, Integer> map= new HashMap<>();
        for(int n:nums) map.put(n,map.getOrDefault(n,0)+1);
        int max=Integer.MIN_VALUE;
        for(int n:map.values()) max=Math.max(max,n);
        ArrayList<Integer> list=new ArrayList<>();
        for(int n:nums) list.add(n);
        for(int i=0;i<max;i++){
            ArrayList<Integer> l1=new ArrayList<>();
            int ind=0;
            while(ind<list.size()){
                int n=list.get(ind);
                if(!l1.contains(n)){
                    l1.add(n);
                    list.remove(ind);
                }
                else ind++;
            }
            res.add(l1);
        }
        return res;*/
        List<List<Integer>> res= new ArrayList<>();
        Map<Integer, Integer> map= new HashMap<>();
        for(int num:nums){
            int row=map.getOrDefault(num,0);
            if(row==res.size()){
                res.add(new ArrayList<>());
            }
            res.get(row).add(num);
            map.put(num,row+1);
        }
        return res;
    }
}