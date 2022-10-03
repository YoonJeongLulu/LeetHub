# Write your MySQL query statement below
select u.name, IFNULL(tb.travelled_distance, 0) as travelled_distance
from (select user_id, sum(distance) as travelled_distance from rides group by user_id) tb right join users u on tb.user_id = u.id
order by tb.travelled_distance desc, u.name asc;