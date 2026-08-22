/**
 * @param {number} n
 * @return {boolean}
 */
var checkDivisibility = function(n) 
{
    let sum=0
    let product=1
    let ans=n
    while(n>0)
    {
        let rem=n%10
        sum+=rem
        product *= rem
        n=Math.floor(n/10)
    }
    if(ans % (sum + product)==0)
    {
        return true;
    }else{
        return false;
    }
    
};