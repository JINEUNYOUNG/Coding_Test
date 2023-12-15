SELECT ORDER_ID	,PRODUCT_ID	,to_char(OUT_DATE,'YYYY-MM-DD'),	
case 
when cast(OUT_DATE as timestamp) <= to_date('2022-05-01','YYYY-MM-DD') then '출고완료'
when out_date is null then '출고미정'
else '출고대기'
end as "출고여부"
from FOOD_ORDER
order by order_id