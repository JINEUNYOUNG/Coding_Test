select b.REST_ID,	b.REST_NAME,	b.FOOD_TYPE,	b.FAVORITES,	b.ADDRESS, round(avg(a.review_score),2) as SCORE
from 
rest_review a 
inner join
(SELECT *
from REST_INFO 
where address like ('서울%')) b on b.rest_id=a.rest_id
group by b.REST_ID,	b.REST_NAME,	b.FOOD_TYPE,	b.FAVORITES,	b.ADDRESS
order by score desc, favorites desc