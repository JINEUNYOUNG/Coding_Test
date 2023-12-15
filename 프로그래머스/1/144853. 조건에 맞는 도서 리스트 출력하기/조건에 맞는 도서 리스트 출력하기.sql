select book_id, to_char(published_date,'YYYY-MM-DD')
from book
where extract(year from PUBLISHED_DATE)=2021 and category ='인문'
order by published_date