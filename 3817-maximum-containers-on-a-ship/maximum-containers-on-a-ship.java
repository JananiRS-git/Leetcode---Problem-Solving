class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int num=n*n;
        if((num*w)<=maxWeight) return num;
        int count=0;
        int i=w;
        while(i<=maxWeight){
            count++;
            i+=w;
        }
        return count;
    }
}