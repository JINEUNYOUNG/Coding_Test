select a.cart_id from 
(SELECT cart_id, count(*) as milk
from cart_products
where name in ('Milk')
group by cart_id) a
inner join
(SELECT cart_id, count(*) as yogurt
from cart_products
where name in ('Yogurt')
group by cart_id) b on a.cart_id=b.cart_id
order by a.cart_id