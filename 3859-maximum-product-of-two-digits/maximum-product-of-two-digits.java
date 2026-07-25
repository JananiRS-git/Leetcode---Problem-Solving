class Solution {
    public int maxProduct(int n) {
        int res=0;
        List<Integer> list= new ArrayList<>();
        while(n>0){
            res=n%10;
            list.add(res);
            n/=10;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            int pro=1;
            for(int j=i+1;j<list.size();j++){
                pro=list.get(i)*list.get(j);
                max=Math.max(max,pro);
            }
        }
        return max;
    }
}