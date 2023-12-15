SELECT animal_id, name
from animal_ins
where animal_type = 'Dog' and (name like '%el%' or name like '%El%')
order by name