# Write your MySQL query statement below
select name from employee where id IN(select managerId as k from Employee group by managerId having count(managerId)>=5);