class Solution {
    public int prefixConnected(String[] words, int k) {
        int count=0;
        Map<String, Integer> map= new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=k){
            String s1 = words[i].substring(0, k);
            map.put(s1, map.getOrDefault(s1,0)+1);
            if(map.get(s1)==2) count++;
            }
        }
        return count;
    }
}