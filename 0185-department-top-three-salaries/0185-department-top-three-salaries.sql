# Write your MySQL query statement below
SELECT d.name Department, e.name Employee, Salary
FROM Employee e, Department d
WHERE e.DepartmentId = d.id AND (SELECT COUNT(DISTINCT e2.Salary)
                                    FROM Employee e2
                                    WHERE E2.Salary > e.Salary AND e.DepartmentId = e2.departmentId) <3;
