# Write your MySQL query statement below
SELECT DISTINCT class 
FROM Courses 
WHERE (
    SELECT COUNT(*) 
    FROM Courses AS c 
    WHERE c.class = Courses.class
) >= 5;