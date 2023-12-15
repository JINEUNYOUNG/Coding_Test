SELECT a.animal_id, a.animal_type, a.name
from animal_ins a full outer join animal_outs b on a.animal_id = b.animal_id
where a.SEX_UPON_INTAKE like 'Intact%'       AND (b.SEX_UPON_OUTCOME LIKE 'Spayed%' OR b.SEX_UPON_OUTCOME LIKE 'Neutered%');