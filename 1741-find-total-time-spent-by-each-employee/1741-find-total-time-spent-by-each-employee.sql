# Write your MySQL query statement below
select tb.event_day as day, tb.emp_id as emp_id, sum(diff_time) as total_time
from (select event_day, emp_id, out_time - in_time as diff_time from employees) tb group by 1, 2;