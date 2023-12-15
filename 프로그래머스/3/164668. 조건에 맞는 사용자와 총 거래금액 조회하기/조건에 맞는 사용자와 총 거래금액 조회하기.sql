SELECT a.user_id, a.nickname, b.total_sales
FROM used_goods_user a
inner JOIN (
    SELECT writer_id, SUM(price) AS TOTAL_SALES
    FROM USED_GOODS_BOARD
    where status='DONE'
    GROUP BY writer_id
) b 
ON a.user_id = b.writer_id
WHERE b.total_sales >= 700000
order by b.total_sales;