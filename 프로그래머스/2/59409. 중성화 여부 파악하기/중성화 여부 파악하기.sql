SELECT animal_id, name, 'O' as 중성화
from ANIMAL_INS
where SEX_UPON_INTAKE like 'Neutered%' or SEX_UPON_INTAKE like 'Spayed%'
union
SELECT animal_id, name, 'X' as 중성화
from ANIMAL_INS
where SEX_UPON_INTAKE not like 'Neutered%' and SEX_UPON_INTAKE not like 'Spayed%'
order by animal_id