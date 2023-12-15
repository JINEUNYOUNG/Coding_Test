SELECT a.product_code, SUM(price * sales_amount) as sales
FROM product a
LEFT JOIN offline_sale b ON a.PRODUCT_ID = b.PRODUCT_ID
GROUP BY a.product_id, a.product_code
ORDER BY sales DESC, a.product_code;