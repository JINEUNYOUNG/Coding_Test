# CodingTest


<img width="150" alt="image" src="https://github.com/JINEUNYOUNG/CodingTest/assets/131138113/b151ae14-ab96-4844-8e1a-cada63aed970"> 

  - 백준
    - Java 단계별로 풀어보기 ~6 진행중 **[53/??]**
  - 프로그래머스
    - SQL(Oracle)  **[74/76]**
    - Java 기초트레이닝 **[93/124]**


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

```
</details>

<details>
    <summary>Java Note</summary>   

  - JAVA
    - str.repeat(n) 메소드
    
    ```jsx
    String str = sc.next();
            int n = sc.nextInt();
            System.out.println(str.repeat(n)); 
    ```
    
    - str.toCharArray / Character.isUpperCase(또는 toLowerCase)
    
    ```jsx
    for (char x : a.toCharArray()) {
                if (Character.isUpperCase(x) == true) {
                    answer += Character.toLowerCase(x); 
                 } else {
                    answer += Character.toUpperCase(x); 
                }
             }
    ```
    
    - 문자열함수 은근 헷갈린다.
    
    > - charAt(숫자) : 숫자번째 문자를 가져옴.  
        숫자 몇번 째 인지 셀때는 0부터 시작한다.   
        만약 "abcde" 일때 charAt(4)라고 쓰면 "e"라고 가져와짐.  
         ex)String arr = "abcde";  
             System.out.println(arr.charAt(3));  
             혹은 "abcde".charAt(3);  
            하면 "d"출력된다.  
    
    - substring(숫자1, 숫자2) : (여기서 substring은 모두 소문자임)   
       문자열에서 숫자1부터 숫자2전까지의 문자들을 문자열로 반환함.  
       숫자 세는거는 역시 0부터 셈.  
        ex) String arr = "abcde";     
             System.out.println(arr.substring(2,4);  
             혹은 "abcde".substring(2,4)   라고 치면 0부터 시작해서 2,3번째의 값이 나옴.  
            결과는 "c,d"가 나온다. 
    
    -  indexOf(문자) : 문자가 몇번째 인지 숫자를 셈.  
        숫자를 셀때는 0부터 시작한다.  
        만약 문자가 없다면 -1을 반환하게 됨.  
        ex) String arr = "abcde";    
             System.out.println(arr.indexOf("b");  
             혹은 "abcde".indexOf("b");   라고 치면 결과값은 1이 나옴.  
    
    - lastIndexOf(문자) : indexOf(문자)와 반대로 뒤에서 부터 몇번째 문자인지 셈.  
       마찬가지로 0부터 시작함.  
        ex) String arr = "abcde";    
             System.out.println(arr.lastIndexOf("b"));  
             혹은 "abcde".lastIndexOf("b");   라고 치면 결과값은 3이 나옴.  
    > 
    
- str은 str.length() str[]은 str.length  (왜까먹었지…….?)

- **String.valueOf(a) 하면 int→String으로, Integer.parseInt(a)하면 String→int로**

- 제곱 Math.pow(int, 곱하는수) 하면 값은 float… int변환은 (int)Math.pow(~)로 가능하지만.. x*x 이런식으로 푸는게 더 쉬울지도

- ***문자열비교 ==로도 될 때가 있지만 예외가 있으므로 꼭 str.equals(~)로 합시다!!!!***

- 파이썬이랑 헷갈리지말자.. string은 “” char는 ‘’

- 정수의 범위를 초과하는 큰!! 수 → BigInteger

```jsx
import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        BigInteger bigNumber = new BigInteger(number);
        BigInteger nine = new BigInteger("9");

        BigInteger remainder = bigNumber.remainder(nine);

        return remainder.intValue();
    }
}
```

### 🔎배열과 리스트

종종 헷갈린다. 정리하고 지나가자! 

- 배열 array :  정의와 동시에 길이를 지정한다. → 이후에 바꿀 수 없다.
    - 다 차있지 않아도 처음 지정한 길이로 인식한다.
    - 인덱스가 있어 편리, (인덱스:유일무이한 식별자)
    - 길이를 바꾸려면,
        1. 기존의 배열을 두고, 
        2. 새 길이의 배열을 따로 만들고
        3. 데이터 복사 및 기존 삭제
    - 추가 삭제 메소드가 없다. 직접 구현
    - length.
- 리스트 list : 빈틈없는 데이터의 적재가 가능.
    - 인덱스 : 몇번째 데이터?  .get(i)
    - 비게 둘 수 없다.
        - list.add(~~);
        - list.remove(i);
    - size()
- Arraylist ? 배열을 이용해 리스트를 구현 한 것.
    - 인덱스가 용이하다.
    
- str.contains(~) / endsWith() / startsWith()

- **`for-each`** 루프에서는 배열의 각 요소를 직접 수정할 수 없다. **`for (String x : strArr)`**에서 **`x`**는 배열 **`strArr`**의 각 요소에 대한 복사본일 뿐이며, 이를 수정해도 실제 배열의 내용이 변경되지 않는다.
- for문 돌려서 직접 할당해 줘야함..
- for-each는 안의 내용을 검색하는데 쓰자.

- 삼항연산자가 간단한거 잊지말고..

```java
my_string.endsWith(is_suffix) ? 1 : 0
```

```java

int[][] parts = new int[3][2];
parts.length //3이다. 
//[1 2]
//[3 4]
//[5 6]
```

str 처음으로 등장하는 n 제거하기  replaceFirst(n,””)

```java
String result = input.replaceFirst("0", "");
```

### 정규표현식

```java
class Solution {
    public String solution(String n_str) {
        
        String answer = n_str.replaceFirst("^0+", "");

        return answer;
    }
}
 //  ^0+ :^처음 0이 나오는데, +하나가 아닐 수 있음. 
```

### String과 Char의 대소문자 변환

- String 대문자로 변환 : **toUpperCase()**

```html
String str = "abc"
str = str.toUpperCase(); //"ABC"
```

- String 소문자로 변환 : **toLowerCase()**

```html
String str = "ABC"
str = str.toLowerCase(); //"abc"
```

Char 의 경우는 아래 메서드를 사용한다.

- Char 대문자로 변환 : **Character.toUpperCase(변환을 원하는 단어)**

```html
Char c = "a"
c = Character.toUpperCase(c); //"A"
```

- Char 소문자로 변환: **Character.toLowerCase(변환을 원하는 단어)**

```html
Char c = "A"
c = Character.toLowerCase(c); //"a"
```

### arraylist에서 remove 할 때 주의  점

arraylist는 빈곳을 허용 하지 않기 때문에 하나가 remove되면 다음 요소가 바로 뒤에 붙게 된다. 

인덱스로 remove를 반복돌린다고 할 때 위치가 계속 바뀐다는 것 

그래서 역순으로 지워주는 게 필요하다.

```java
// 역순으로 반복하여 첫 번째와 마지막 인덱스를 제외한 요소 삭제
        for (int i = indexes.size() - 1; i > 0; i--) {
            if (i != indexes.size() - 1) {
                indexes.remove(i);
            }
        }
```

### 배열 정렬 Arrays.sort()

## 문자열묶기

문자열 배열 `strArr`이 주어집니다. `strArr`의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.

• 1 ≤ `strArr`의 원소의 길이 ≤ 30

> 🤔문자열의수:몇개존재하는지? 식으로 쌍으로 저장해야지 않나 고민했는데,
> 
> 
> 문자열갯수를 인덱싱번호에 맞게 넣으면 더 쉽구나..
> 
> lenArr= {””,6,4,3,2..} 라고 하면,  1개인 문자열 6개. 이런 식 
> 

```java
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        int[] lenArr = new int[30];
        for(int i = 0; i < strArr.length; i++) {
            lenArr[strArr[i].length()-1]++;
        }
        for(int num : lenArr) {
            if(answer < num) answer = num;
        }
        return answer;
    }
}
```

</details>
