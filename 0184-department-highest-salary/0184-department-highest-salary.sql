# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary from Department d
right join Employee e
on e.departmentId=d.id
where e.salary=(
    select max(e2.salary) from Employee e2
    where e.departmentId=e2.departmentId
);