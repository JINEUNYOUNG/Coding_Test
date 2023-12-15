SELECT b.animal_id, b.name
from animal_ins a full outer join animal_outs b on a.animal_id = b.animal_id
where a.animal_id is null
order by b.animal_id