SELECT WAREHOUSE_ID, WAREHOUSE_NAME,	ADDRESS	TLNO,    NVL(FREEZER_YN, 'N') AS FREEZER_YN

FROM food_warehouse
WHERE address LIKE '경기도%';