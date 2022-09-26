# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
delete from person
where id not in (
    select sub.min_id
    from (
        select min(id) as min_id, email
        from person
        group by email) as sub);