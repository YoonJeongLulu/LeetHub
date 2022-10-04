# Write your MySQL query statement below
select u.name, tb.sum as balance
from (select account, sum(amount) as sum from Transactions group by account having sum(amount) >= 10000) tb join users u on u.account = tb.account;