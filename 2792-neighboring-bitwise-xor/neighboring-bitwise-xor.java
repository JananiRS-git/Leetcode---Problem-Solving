class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor=derived[0];
        for(int i=1;i<derived.length;i++){
            xor=xor^derived[i];
        }
        if(xor==0) return true;
        return false;
    }
}