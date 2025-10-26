class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,n+1);
        dp[0] =0;
        for (int i =1;i<=n;i++) {
            for (int j=1;j*j<=i;j++) {
                int perfectSquare =j*j;
                dp[i] =Math.min(dp[i],1+dp[i-perfectSquare]);
            }
        }
        return dp[n];
    }
}