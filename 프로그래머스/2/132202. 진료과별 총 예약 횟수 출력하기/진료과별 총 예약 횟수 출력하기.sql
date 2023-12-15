SELECT mcdp_cd as "진료과코드", count(*) as "5월예약건수"
from APPOINTMENT
where extract (month from cast(APNT_YMD as timestamp))='5'
group by mcdp_cd
order by "5월예약건수", "진료과코드"