class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        int i=0; 
        int[] count=new int[26]; 
        for(int j=0;j<s.length();j++){
            count[s.charAt(j)-'a']++;
            while(count[s.charAt(j)-'a']>2){
                count[s.charAt(i)-'a']--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
