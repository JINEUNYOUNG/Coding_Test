SELECT
    history_id,
    car_id,
    TO_CHAR(start_date, 'YYYY-MM-DD') AS start_date,
    TO_CHAR(end_date, 'YYYY-MM-DD') AS end_date,
    '장기 대여' AS rent_type
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE
    TO_CHAR(start_date, 'YYYY-MM') = '2022-09' AND (end_date - start_date+1) >= 30
UNION ALL
SELECT
    history_id,
    car_id,
    TO_CHAR(start_date, 'YYYY-MM-DD') AS start_date,
    TO_CHAR(end_date, 'YYYY-MM-DD') AS end_date,
    '단기 대여' AS rent_type
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE
    TO_CHAR(start_date, 'YYYY-MM') = '2022-09' AND (end_date - start_date+1) < 30
ORDER BY
    history_id DESC;