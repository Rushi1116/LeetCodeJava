# Write your MySQL query statement below
select name Customers from Customers where id not in (select customerid from orders);