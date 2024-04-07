# Write your MySQL query statement below
SELECT ROUND(SUM(tiv_2016), 2) tiv_2016
FROM Insurance a
WHERE a.tiv_2015 IN (SELECT tiv_2015
                     FROM Insurance
                     WHERE pid <> a.pid)
  AND (a.lat, a.lon) NOT IN
      (SELECT lat, lon
       FROM Insurance
       WHERE pid <> a.pid);