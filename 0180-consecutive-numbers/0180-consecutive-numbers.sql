# Write your MySQL query statement below
# select num,count(num) from Logs group by num;

select distinct num as ConsecutiveNums  from(
    select num,
    LAG(num,1) over(order by id) as prev1,
    LAG(num,2) over(order by id) as prev2
    from Logs
) t
where num=prev1 and prev1=prev2;