class Solution:
   
    def sumGame(self, num: str) -> bool:
        leftSum=0
        rightSum=0

        leftQ=0
        rightQ=0

        n=len(num)
        mid=n//2

        for i in range(mid):
            if num[i]=="?":
                leftQ+=1
                continue
            leftSum +=int(num[i])
        
        for i in range(mid,n):
            if num[i]=='?':
                rightQ+=1
                continue
            rightSum += int(num[i])

        totalQ=leftQ+rightQ
        if totalQ%2!=0:
            return True
        if leftSum==rightSum and leftQ==rightQ:
            return False

        if leftQ>rightQ:
            q=leftQ-rightQ
            leftSum += 9*(q/2)
            if leftSum==rightSum:
                return False
        else:
            q=rightQ-leftQ
            rightSum += 9*(q/2)
            if leftSum==rightSum:
                return False
        return True


    

