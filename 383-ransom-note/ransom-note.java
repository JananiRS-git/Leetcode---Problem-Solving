class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //if(magazine.contains(ransomNote)) return true;
        char[] r=ransomNote.toCharArray();
        char[] m=magazine.toCharArray();
        Arrays.sort(r);
        Arrays.sort(m);
        int i=0;
        int j=0;
        while(i<r.length && j<m.length){
            if(r[i]==m[j]){
                i++;
            }
            j++;
        }
        if(i==r.length) return true;
        return false;
    }
}