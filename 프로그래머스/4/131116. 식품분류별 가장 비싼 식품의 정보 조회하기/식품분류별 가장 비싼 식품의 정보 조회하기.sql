select b.*, a.product_name
from FOOD_PRODUCT a inner join (SELECT CATEGORY, max(price) as MAX_PRICE
from FOOD_PRODUCT
                                where category in ('과자','국','김치','식용유')
group by CATEGORY)b on b.max_price=a.price and b.category=a.category
order by b.max_price desc