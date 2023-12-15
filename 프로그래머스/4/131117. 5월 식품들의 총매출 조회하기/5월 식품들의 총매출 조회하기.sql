select a.PRODUCT_ID,	a.PRODUCT_NAME,	sum(a.price*b.amount) as TOTAL_SALES
from
food_product a 
 join
(SELECT *
from FOOD_ORDER
where extract (month from produce_date) =5) b on b.product_id=a.product_id
group by a.product_id, a.product_name
order by total_sales desc, a.product_id