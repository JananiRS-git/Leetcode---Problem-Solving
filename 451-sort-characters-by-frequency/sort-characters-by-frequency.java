class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)-> b.getValue()-a.getValue());
        StringBuilder sb= new StringBuilder();
        for(Map.Entry<Character, Integer> e:list){
            for(int i=0;i<e.getValue();i++){
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }
}