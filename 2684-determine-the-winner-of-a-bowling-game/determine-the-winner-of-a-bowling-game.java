class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int score=0;
        for(int i=player1.length-1;i>=0;i--){
            if(i>=1 && player1[i-1]==10 || i>=2 && player1[i-2]==10){
                score += player1[i]*2;
            }else score += player1[i];
        }
        int score2=0;
        for(int j=player2.length-1;j>=0;j--){
            if(j>=1 && player2[j-1]==10 || j>=2 && player2[j-2]==10){
                score2 += player2[j]*2;
            }
            else{
                score2 += player2[j];
            }
        }
        if(score>score2) return 1;
        else if (score<score2) return 2;
        else return 0;
    }
}