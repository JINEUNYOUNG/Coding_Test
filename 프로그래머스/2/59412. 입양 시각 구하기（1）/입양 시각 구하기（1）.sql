SELECT extract (hour from CAST(datetime AS TIMESTAMP)) as hour, count(*) as count
from ANIMAL_OUTS
where extract (hour from CAST(datetime AS TIMESTAMP))  >= 9 and extract (hour from CAST(datetime AS TIMESTAMP)) < 20
group by extract (hour from CAST(datetime AS TIMESTAMP)) 
order by extract (hour from CAST(datetime AS TIMESTAMP))