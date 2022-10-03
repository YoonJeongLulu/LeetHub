# Write your MySQL query statement below
select u.user_id as buyer_id, u.join_date, IFNULL(tb.number, 0) as orders_in_2019
from (select buyer_id, count(order_id) as number from orders where order_date between "2019-01-01" and "2019-12-31" group by buyer_id) tb right join users u
on tb.buyer_id = u.user_id;