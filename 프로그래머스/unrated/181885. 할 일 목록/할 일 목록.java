import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                resultList.add(todo_list[i]);
            }
        }

        // 리스트를 배열로 변환
        String[] answer = resultList.toArray(new String[0]);
        return answer;
    }
}
