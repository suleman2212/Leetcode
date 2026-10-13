class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        left=0
        right=0
        ans=[]
        sum=0
        while left<len(nums1) and right<len(nums2):
            if nums1[left]<nums2[right]:
                ans.append(nums1[left])
                left+=1
            else:
                ans.append(nums2[right])
                right+=1
        while left<len(nums1):
            ans.append(nums1[left])
            left+=1
        while right<len(nums2):
            ans.append(nums2[right])
            right+=1
        if len(ans)%2==0:
            mid = (ans[len(ans)//2] + ans[len(ans)//2 - 1])/2
        else:
            mid = ans[len(ans)//2]

        return mid