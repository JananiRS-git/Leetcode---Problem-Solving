class Solution {
    public int maxNumberOfBalloons(String text) {
        int res[]=new int[26];
        for(char ch:text.toCharArray()){
            res[ch-'a']++;
        }
        return Math.min(
        Math.min(res['b'-'a'],res['a'-'a']),
        Math.min(res['l'-'a']/2, 
        Math.min(res['o'-'a']/2, res['n'-'a']))
        );
    }
}