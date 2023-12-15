SELECT BOARD_ID,	WRITER_ID,	TITLE,	
PRICE,	
case when STATUS='DONE' then '거래완료' 
when status='RESERVED' then '예약중'
else '판매중'
end as status
from USED_GOODS_BOARD
where to_char(CREATED_DATE,'YYYY-MM-DD') = '2022-10-05'
order by board_id desc