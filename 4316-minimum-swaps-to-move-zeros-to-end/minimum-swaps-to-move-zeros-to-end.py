class Solution:
    def minimumSwaps(self, nums: list[int]) -> int:
        count=0
        for i in range(len(nums)):
            if nums[i]!=0:
                count+=1
        res=0
        for i in range(count):
            if nums[i]==0:
                res+=1
        return res
            

        