select b.category, sum(a.sales) as TOTAL_SALES
from
(SELECT *
from BOOK_SALES 
where extract(month from SALES_DATE)='1') a, book b 
where a.book_id=b.book_id
group by category
order by category