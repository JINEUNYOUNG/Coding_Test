SELECT datetime as "시간"
from 
    (select * from animal_ins order by datetime) 
where rownum = 1