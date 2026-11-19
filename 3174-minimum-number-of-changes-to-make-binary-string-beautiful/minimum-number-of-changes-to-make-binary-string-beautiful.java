class Solution {
    public int minChanges(String s) {
        // int c=0,c1=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==1){
        //         c++;
        //     }else{
        //         c1++;
        //     }
        // }
        // if(c%2==0 && c1%2==0)
        int c=0;
        for(int i=0;i<s.length()-1;i+=2){
            if(s.charAt(i)!=s.charAt(i+1)){
                c++;
            }
        }
        return c;
    }
}