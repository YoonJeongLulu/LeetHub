# Write your MySQL query statement below
select customer_number 
from 
(select customer_number, count(order_number) as cnt from orders group by customer_number) tb order by tb.cnt desc limit 1;
