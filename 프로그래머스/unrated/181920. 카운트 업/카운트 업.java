import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> resultList = new ArrayList<>(); //배열의 크기를 알 수 없으니 arraylist생성
        for (int i = start_num; i <= end_num; i++) { 
            resultList.add(i); //add로 추가. 
        }  

        // 리스트 생성. resultList사이즈로 만들기. for문 돌려서 넣어주기
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
