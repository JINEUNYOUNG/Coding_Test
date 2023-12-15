SELECT 
    EXTRACT(YEAR FROM sales_date) AS "YEAR",
    EXTRACT(MONTH FROM sales_date) AS "MONTH",
    gender,
    COUNT(distinct user_id) AS users
FROM (
    SELECT 
        a.gender,
        b.user_id,
        b.sales_date
    FROM 
        user_info a
    JOIN 
        online_sale b ON a.user_id = b.user_id 
    WHERE 
        gender IS NOT NULL
    GROUP BY 
        a.gender, b.sales_date, b.user_id
    ORDER BY 
        b.sales_date
)
GROUP BY 
    EXTRACT(YEAR FROM sales_date), 
    EXTRACT(MONTH FROM sales_date), 
    gender
ORDER BY 
    EXTRACT(YEAR FROM sales_date), 
    EXTRACT(MONTH FROM sales_date), 
    gender;