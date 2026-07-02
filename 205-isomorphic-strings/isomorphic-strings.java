class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                char ch1=t.charAt(i);
                if(s.indexOf(ch)!=t.indexOf(ch1)) return false;    
        }
        return true;
    }
}