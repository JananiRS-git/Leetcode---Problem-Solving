class Solution:
    def findMiddleIndex(self, nums: list[int]) -> int:
        l=0;
        tot= sum(nums)
        for i,j in enumerate(nums):
            if l==(tot-l-j):
                return i
            else:
                l+=j
        return -1