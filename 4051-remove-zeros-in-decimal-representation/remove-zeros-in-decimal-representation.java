class Solution {
    public long removeZeros(long n) {
        StringBuilder sb=new StringBuilder();
        Long a=n;
        String res=Long.toString(a);
        for(int i=0;i<res.length();i++){
            char ch=res.charAt(i);
            if(ch!='0'){
                sb.append(ch);
            }
        }
        return Long.parseLong(sb.toString());
    }
}