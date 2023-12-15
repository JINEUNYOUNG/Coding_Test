select extract(month from b.start_date) as month,b.car_id,  count(*) as records
from
(   select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where extract(month from start_date) in ('8','9','10')
    group by car_id
    having count(*) >= 5
) a, CAR_RENTAL_COMPANY_RENTAL_HISTORY b
where a.car_id = b.car_id and extract(month from b.start_date) in ('8','9','10')
group by b.car_id, extract(month from b.start_date)
order by month, b.car_id desc