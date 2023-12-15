select history_id, (daily_fee*(1-ratee)*datee) as fee
from
(select history_id, DAILY_FEE, (end_date-start_date+1)as datee,
case when END_DATE - START_DATE + 1 >= 7 and END_DATE - START_DATE + 1 < 30 then 0.05
when END_DATE - START_DATE + 1 >= 30 and END_DATE - START_DATE + 1 < 90 then 0.08
when END_DATE - START_DATE + 1 >= 90 then 0.15 else 0
 end as ratee
 from 
CAR_RENTAL_COMPANY_RENTAL_HISTORY  a inner join 
(select *
from CAR_RENTAL_COMPANY_CAR
where car_type='트럭'
) b on a.car_id=b.car_id)
order by fee desc, history_id desc