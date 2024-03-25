# Write your MySQL query statement below
Select s.user_id, case when c.action is NULL then 0.00 else Round((sum(c.action = 'confirmed')/count(c.action)),2 )end as confirmation_rate
From Signups s
left join
Confirmations c
on s.user_id = c.user_id
group by s.user_id;