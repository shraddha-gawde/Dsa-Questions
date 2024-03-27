# Write your MySQL query statement below
SELECT r.contest_id, ROUND((COUNT(r.contest_id)/(select COUNT(*) from Users)) * 100, 2) as percentage
FROM Users u
LEFT JOIN Register r 
ON u.user_id = r.user_id
GROUP BY r.contest_id
HAVING r.contest_id IS NOT NULL
ORDER BY percentage DESC, r.contest_id