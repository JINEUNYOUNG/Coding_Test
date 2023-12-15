select 
'/home/grep/src/'|| b.board_id || '/' || b.file_id|| b.file_name || b.file_ext AS file_path

from 
(SELECT *
from USED_GOODS_BOARD
order by views desc
fetch first 1 rows only) a, USED_GOODS_FILE b
where a.board_id = b.board_id
order by b.file_id desc