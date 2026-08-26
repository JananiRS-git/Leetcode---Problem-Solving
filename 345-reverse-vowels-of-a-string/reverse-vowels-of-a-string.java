class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if("aeiouAEIOU".indexOf(ch[i])==-1) i++;
            else if("aeiouAEIOU".indexOf(ch[j])==-1) j--;
            else {
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}