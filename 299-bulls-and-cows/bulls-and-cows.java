class Solution {
    public String getHint(String secret, String guess) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        int count1=0;
        int[] num=new int[20];
        for(int i=0;i<secret.length();i++){
                char c2=guess.charAt(i);
                char c=secret.charAt(i);
                if(c==c2){
                    count++;
                }
                else{
                    if(num[c-'0']++ <0) count1++;
                    if(num[c2-'0']-- >0) count1++;
                }
        }
        sb.append(count+"A");
        sb.append(count1+"B");
        return sb.toString();
    }
}