# Write your MySQL query statement below
SELECT
  ROUND(COUNT( player_id) / (SELECT COUNT(distinct player_id) from Activity),2) AS fraction
FROM
  Activity
WHERE
  (player_id, DATE_SUB(event_date, INTERVAL 1 DAY))
  IN (
    SELECT player_id, MIN(event_date) AS first_login FROM Activity GROUP BY player_id
  )