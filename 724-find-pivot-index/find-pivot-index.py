class Solution:
    def pivotIndex(self, nums: list[int]) -> int:
        l=0;
        tot= sum(nums)
        for i,j in enumerate(nums):
            if l==(tot-l-j):
                return i
                break
            else:
                l+=j
        return -1
        