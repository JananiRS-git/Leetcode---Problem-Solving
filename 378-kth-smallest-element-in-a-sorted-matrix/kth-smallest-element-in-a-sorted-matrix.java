class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int[] num:matrix){
            for(int r:num){
                res.add(r);
            }
        }
        Collections.sort(res);
        return res.get(k-1);
    }
}