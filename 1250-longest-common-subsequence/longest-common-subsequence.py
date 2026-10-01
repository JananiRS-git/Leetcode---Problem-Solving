class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        @cache
        def ack(i,j):
            if i==len(text1) or j==len(text2):
                return 0
            if text1[i]==text2[j]:
                return 1+ ack(i+1,j+1)
            return max(ack(i+1,j),ack(i,j+1))
        return ack(0,0)
            

    
            
