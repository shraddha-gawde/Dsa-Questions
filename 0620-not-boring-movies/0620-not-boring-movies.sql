# Write your MySQL query statement below
SELECT * FROM Cinema
where id % 2 = 1 and description != 'boring'
order by rating desc