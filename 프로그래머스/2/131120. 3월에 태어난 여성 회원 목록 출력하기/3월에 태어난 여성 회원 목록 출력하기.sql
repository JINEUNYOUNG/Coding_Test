SELECT member_id,	member_name,	gender,	to_char(date_of_birth,'YYYY-MM-DD') as DATE_OF_BIRTH
from member_profile
where extract(month from cast(date_of_birth as timestamp)) = '3' and tlno is not null and gender = 'W'
order by member_id