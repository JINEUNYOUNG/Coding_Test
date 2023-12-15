WITH AllHours AS (
    SELECT LEVEL - 1 AS HOUR
    FROM dual
    CONNECT BY LEVEL <= 24
)
SELECT AllHours.HOUR, COUNT(animal_outs.datetime) AS count
FROM AllHours
LEFT JOIN animal_outs ON AllHours.HOUR = EXTRACT(HOUR FROM CAST(animal_outs.DATETIME AS TIMESTAMP))
GROUP BY AllHours.HOUR
ORDER BY AllHours.HOUR;