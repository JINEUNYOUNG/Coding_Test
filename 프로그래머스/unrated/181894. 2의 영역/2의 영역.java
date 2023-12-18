import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> indexes = new ArrayList<>();
        int index = 0;
        for (int x : arr) {
            if (x == 2) { 
                indexes.add(index++);
            } else {index++;}
        } //1,5가 들어갔을 것. 

        // indexes가 비어있으면 빈 배열 반환
        if (indexes.isEmpty()) {
         return new int[]{-1};
        }

        // indexes가 2개 이하인 경우에 대한 처리 
        if (indexes.size() < 2) {
            int[] answer = new int[indexes.size()];  
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[indexes.get(i)];
            }
            return answer;
        }

        // 역순으로 반복하여 첫 번째와 마지막 인덱스를 제외한 요소 삭제
        for (int i = indexes.size() - 2; i > 0; i--) {
            indexes.remove(i);
        }
        if (indexes.size() == 1) {
            int[] answer = new int[1];
            answer[0] = arr[indexes.get(0)] ;
            return answer;
        }

        // indexes는 0: 처음, 1: 마지막 인덱스만 남아 있다.
        int[] answer = new int[indexes.get(1) - indexes.get(0) + 1];

        // 부분 배열을 만들어 반환
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[indexes.get(0) + i];
        }

        return answer;
    }
}
