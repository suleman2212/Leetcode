class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        arr=[]
        
        ans=0
        for i in range(len(s)):
            while s[i] in arr:
                if len(arr)>ans:
                    ans=len(arr)
                arr.pop(0)
            else:
                arr.append(s[i])
                
        if len(arr)>ans:
            return len(arr)
        else: 
            return ans


        