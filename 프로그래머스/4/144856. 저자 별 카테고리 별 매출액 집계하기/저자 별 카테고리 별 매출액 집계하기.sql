select b.author_id, a.author_name, b.category, b.total_sales
from (SELECT author_id, category, sum(s *price) as total_sales
from book a inner join (select book_id, sum(sales) as s from book_sales
where extract(month from sales_date)='1' group by book_id)b on (b.book_id=a.book_id)
group by author_id, category
order by author_id, category desc) b, author a
where b.author_id=a.author_id