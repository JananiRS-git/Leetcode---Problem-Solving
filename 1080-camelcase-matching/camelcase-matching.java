class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res= new ArrayList<>();
        for(String s:queries){
            boolean b= true;
            int i=0;
            for(char ch:s.toCharArray()){
                if(i<pattern.length()&&ch==pattern.charAt(i)){
                    i++;
                }
                else if (Character.isUpperCase(ch)){
                    b=false;
                    break;
                }
            }
            res.add(b&&i==pattern.length());
        }
        return res;
    }
}