class Solution {
    public String reverseWords(String s) {
        s=s.trim();//remove extra space
        String arr[]=s.split("\s+");// split words
        StringBuilder res=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            res.append(arr[i]+" ");
        }
        return res.toString().trim();
    }
}