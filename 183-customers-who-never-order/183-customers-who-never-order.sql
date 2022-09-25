# Write your MySQL query statement below
select c.name as Customers
from customers as c
left join orders as o on c.Id = o.customerId
where o.id is null;