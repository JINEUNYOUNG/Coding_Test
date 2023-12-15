SELECT b.book_id, a.author_name, to_char(b.PUBLISHED_DATE,'YYYY-MM-DD') as published_date
from BOOK b , author a
where b.category='경제' and a.author_id=b.author_id
order by published_date