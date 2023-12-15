# CodingTest


<img width="150" alt="image" src="https://github.com/JINEUNYOUNG/CodingTest/assets/131138113/b151ae14-ab96-4844-8e1a-cada63aed970"> 

  - 백준  
  - 프로그래머스


<details>
  <summary>SQL Note</summary>   


> 언어 : SQL(Oracle)  
> 문제수 : **76 문제(완료)**  
> 학습기간 : 2023.11.07~11.09  

### 1~23시까지 모든 시간을 나타내도록 해보자

https://school.programmers.co.kr/learn/courses/30/lessons/59413#qna

- with절로 allhours(0~23) 정의 → allhours와 animal_outs를  join

```sql
WITH AllHours AS (
SELECT LEVEL - 1 AS HOUR  --1부터 24를 생성하고 -1해서 0~23 만들기
FROM dual
CONNECT BY LEVEL <= 24 --레벨이 1에서 24까지의 값을 가질 때까지 계층적으로 행을 생성
)
SELECT AllHours.HOUR, COUNT(animal_outs.datetime) AS count
FROM AllHours
LEFT JOIN animal_outs ON AllHours.HOUR = EXTRACT(HOUR FROM CAST(animal_outs.DATETIME AS TIMESTAMP))
GROUP BY AllHours.HOUR
ORDER BY AllHours.HOUR;
```

### null인 경우에 다른 값으로 치환

NVL : **`NVL`** 함수는 인자값이 NULL이 아니면 인자값을 반환하고, NULL이면 **`2`번째 인수**를 반환

```sql
SELECT 
    WAREHOUSE_ID,
    WAREHOUSE_NAME,
    ADDRESS,
    NVL(FREEZER_YN, 'N') AS FREEZER_YN --이부분
FROM 
    FOOD_WAREHOUSE
WHERE 
    ADDRESS LIKE '경기도%'
ORDER BY 
    WAREHOUSE_ID;
```

### 정렬 후에 상위 3개만 뽑기

여기서 주의점! → where rownum < 4 로는 할 수 없다 
(order by로 정렬되기 전에 뽑아버리기 때문에)

```sql
SELECT
B.FLAVOR
FROM FIRST_HALF A RIGHT OUTER JOIN JULY B
ON A.SHIPMENT_ID = B.SHIPMENT_ID
AND A.FLAVOR = B.FLAVOR
GROUP BY B.FLAVOR
ORDER BY
SUM(A.TOTAL_ORDER) + SUM(B.TOTAL_ORDER) DESC
FETCH FIRST 3 ROWS ONLY
```

### case 써보기

```sql
CASE
WHEN (end_date - start_date) + 1 >= 30 THEN '장기 대여'
ELSE '단기 대여'
END AS rent_type
```

### extract 써보기

```sql
select systimestamp,
extract (year from systimestamp) as year,
extract (month from systimestamp) as month,
extract (day from systimestamp) as day,
extract (hour from systimestamp) as hour,
extract (minute from systimestamp) as minute,
extract (second from systimestamp) as second
from dual;
```

### to_char

: ‘99990.0’ 0이 없어도 표현해준다. 

```sql
SELECT car_id, TO_CHAR(AVERAGE_DURATION, '99990.0') AS AVERAGE_DURATION
FROM (
SELECT car_id, AVG(end_date - start_date) AS AVERAGE_DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY car_id
)
WHERE AVERAGE_DURATION >= 7
ORDER BY AVERAGE_DURATION DESC, car_id DESC;
```

### 예약어에는 “”

: 작은따옴표가 기본이나 예약어로 쓸때는 꼭 “”로 해줘야한다 

```sql
-- 코드를 입력하세요
SELECT ORDER_ID	,PRODUCT_ID	,OUT_DATE,	
case 
when cast(OUT_DATE as timestamp) < to_date('2022-05-01','YYYY-MM-DD') then '출고완료'
else '출고미정'
end as "출고여부"
from FOOD_ORDER
```

### group by 문제

살짝 헷갈렸다. 0과 1로 라벨링해서 sum으로 검증하는 방식으로 해결

https://school.programmers.co.kr/learn/courses/30/lessons/157340#qna

```sql
SELECT CAR_ID, CASE WHEN AP = 0 THEN '대여 가능' ELSE '대여중' END AS AVAILABILITY
FROM (SELECT CAR_ID, 
             SUM(CASE WHEN TO_DATE('2022-10-16', 'YYYY-MM-DD') 
                 BETWEEN START_DATE AND END_DATE THEN 1 ELSE 0 END) AS AP
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        GROUP BY CAR_ID
    ) --여기서 그룹화하고 0(미대여)과 1(대여중)로 나눈 뒤 sum. 하나라도 대여중이 있으면 1이 되는 방식  
ORDER BY CAR_ID DESC; --밖에서 라벨링 char로 바꿔줌 
```

### 문자열 연결

concat (인자 2개) 또는 || (인자 여럿)

```sql
--제일 간단
a.city || a.STREET_ADDRESS1 || a.STREET_ADDRESS2 AS "전체주소"

--concat 중첩
CONCAT(CONCAT(a.city, a.STREET_ADDRESS1), a.STREET_ADDRESS2) AS "전체주소"

</details>
```
