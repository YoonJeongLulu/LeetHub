# Write your MySQL query statement below
select s.firstName, s.lastName, a.city, a.state from person s left join address a on s.personId = a.personId;