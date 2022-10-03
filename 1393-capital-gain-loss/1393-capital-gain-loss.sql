# Write your MySQL query statement below
select tb.stock_name, sum(price) as capital_gain_loss
from (select stock_name, IF(operation = "Buy" , price*(-1), price) as price from stocks) tb
group by stock_name;