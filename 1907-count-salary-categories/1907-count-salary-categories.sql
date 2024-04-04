# Write your MySQL query statement below
select 'Low Salary' as category,(select count(*) from accounts where income < 20000) as accounts_count
union
select 'Average Salary',(select count(*) from accounts where income > 19999 and income < 50001)
union
select 'High Salary',(select count(*) from accounts where income > 50000);