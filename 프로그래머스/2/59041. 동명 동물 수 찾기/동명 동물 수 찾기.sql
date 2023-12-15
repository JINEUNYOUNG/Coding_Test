SELECT name, count
FROM (
    SELECT name, COUNT(name) AS count
    FROM animal_ins
    GROUP BY name
)
WHERE count >= 2
order by name;