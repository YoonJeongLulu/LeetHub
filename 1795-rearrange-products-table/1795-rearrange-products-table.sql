select p1.product_id, 'store1' as store, store1 as price from (SELECT product_id, store1 FROM Products) p1 where store1 is not null
union
select p2.product_id, 'store2' as store, store2 as price from (SELECT product_id, store2 FROM Products) p2 where store2 is not null
union
select p3.product_id, 'store3' as store, store3 as price from (SELECT product_id, store3 FROM Products) p3 where store3 is not null