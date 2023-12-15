select id, name, a.host_id
from
(
SELECT HOST_ID
from PLACES
group by host_id
having count(host_id)>=2
order by host_id) a, places b
where a.host_id = b.host_id