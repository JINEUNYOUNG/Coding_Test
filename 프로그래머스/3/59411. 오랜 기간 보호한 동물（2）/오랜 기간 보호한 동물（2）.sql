SELECT a.animal_id, a.name
from animal_outs a inner join animal_ins b on a.animal_id=b.animal_id
order by a.datetime - b.datetime desc
fetch first 2 rows only