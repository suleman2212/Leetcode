class Solution:
    def checkDivisibility(self, n: int) -> bool:
        sum=0
        product=1
        ans=n
        while n>0:
        
            rem=n%10
            sum+=rem
            product*=rem
            n=n//10
            print(n)
        
        return ans%(sum+product)==0
   