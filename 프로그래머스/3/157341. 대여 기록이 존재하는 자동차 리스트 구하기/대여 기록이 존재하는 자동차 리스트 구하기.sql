select distinct a.car_id
from
(SELECT *
from CAR_RENTAL_COMPANY_CAR
where car_type='세단')a, 
CAR_RENTAL_COMPANY_RENTAL_HISTORY b 
where a.car_id = b.car_id and extract(month from b.START_DATE) = 10
order by a.car_id desc