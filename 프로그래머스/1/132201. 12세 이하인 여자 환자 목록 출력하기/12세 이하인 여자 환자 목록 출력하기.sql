SELECT  pt_name, pt_no,gend_cd, age, nvl(tlno,'NONE') as tlno
from PATIENT
where AGE <= 12 and gend_cd = 'W'
order by age desc, pt_name