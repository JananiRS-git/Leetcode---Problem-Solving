class Solution:
    def maxDepthAfterSplit(self, seq: str) -> list[int]:
        result=[]
        a=0
        for i in seq:
            if i =='(':
                result.append(a %2)
                a+=1
            else:
                a-=1
                result.append(a%2)
        return result
            
        