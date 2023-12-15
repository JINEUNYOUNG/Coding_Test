SELECT b.ingredient_type, sum(a.total_order) as total_order
from FIRST_HALF a left join ICECREAM_INFO b on (a.flavor = b.flavor)
group by b.ingredient_type
order by total_order