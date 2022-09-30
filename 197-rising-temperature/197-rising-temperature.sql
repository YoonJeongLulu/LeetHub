# Write your MySQL query statement below
select A.id as id from weather a inner join weather b on datediff(a.recordDate, b.recordDate) = 1 and a.temperature > b.temperature;