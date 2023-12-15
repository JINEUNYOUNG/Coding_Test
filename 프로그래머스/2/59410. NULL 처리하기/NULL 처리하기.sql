SELECT ANIMAL_TYPE,	NVL(NAME,'No name') as name, SEX_UPON_INTAKE
from animal_ins
order by animal_id