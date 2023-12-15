SELECT b.TITLE, b.BOARD_ID, r.REPLY_ID, r.WRITER_ID, r.CONTENTS, TO_CHAR(r.CREATED_DATE, 'YYYY-MM-DD') AS created_date 
from USED_GOODS_BOARD b, USED_GOODS_REPLY r 
WHERE b.board_id = r.board_id 
and to_char(b.CREATED_DATE, 'yyyy-mm') = '2022-10'
order by r.CREATED_DATE ASC, b.TITLE ASC;