class Solution:
    def minimumDeletions(self, nums: List[int]) -> int:
        mini=0
        maxi=0
        for i in range(len(nums)):
            if nums[i]>nums[maxi]:
                maxi=i
            if nums[i]<nums[mini]:
                mini=i
        n=len(nums)
        left=max(mini,maxi)+1
        right=n-min(mini,maxi)
        both=min(mini,maxi)+1 + n-max(mini,maxi)
        return min(left,min(right,both))
        