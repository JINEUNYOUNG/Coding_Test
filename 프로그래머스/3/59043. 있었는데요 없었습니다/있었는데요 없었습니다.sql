SELECT a.animal_id, a.name
from animal_ins a full outer join animal_outs b on a.animal_id = b.animal_id
where a.datetime > b.datetime
order by a.datetime