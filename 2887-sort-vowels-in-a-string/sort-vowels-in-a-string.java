class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        for(char ch:s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1) list.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list);
        int i=0;
        for(char ch:s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                sb.append(list.get(i));
                i++;
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}