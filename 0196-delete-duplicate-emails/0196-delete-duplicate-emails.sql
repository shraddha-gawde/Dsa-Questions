# Write your MySQL query statement below
delete p2 from Person p1, Person p2
where p1.Email = p2.Email and p2.id > p1.id;