# Write your MySQL query statement below
Select project_id, round(avg(experience_years*1.0),2)
average_years 
from project p 
inner join employee e 
on p.employee_id = e.employee_id group by project_id;