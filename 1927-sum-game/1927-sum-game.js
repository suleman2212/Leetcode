/**
 * @param {string} num
 * @return {boolean}
 */
var sumGame = function(num) 
{
    let leftSum=0
    let rightSum=0

    let leftQ=0
    let rightQ=0

    let n=num.length
    let mid=n/2

    for(let i=0;i<mid;i++)
    {
        if(num.charAt(i)=='?')
        {
            leftQ++;
            continue;
        }
        leftSum += num.charAt(i)-'0'
    }
    for(let i=mid;i<n;i++)
    {
        if(num.charAt(i)=='?')
        {
            rightQ++;
            continue;
        }
        rightSum += num.charAt(i)-'0'
    }

    let totalQ=leftQ+rightQ
    if(totalQ%2!=0)
    {
        return true//alice win
    }
    if(leftSum==rightSum && leftQ==rightQ)
    {
        return false//bob wins
    }
    if(leftQ>rightQ)
    {
        let q=leftQ-rightQ
        leftSum += 9 * (q)/2
        if(leftSum==rightSum)
        {
            return false
        }
    }
    if(leftQ<rightQ)
    {
        let q=rightQ-leftQ
        rightSum += 9 * (q)/2
        if(leftSum==rightSum)
        {
            return false
        }
    }
    return true
    
};