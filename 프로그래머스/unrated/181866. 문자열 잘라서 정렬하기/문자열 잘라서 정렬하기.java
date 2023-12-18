import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        int count = 0;
        String[] answer = myString.split("x");
        
        // 배열을 사전 순으로 정렬
        Arrays.sort(answer);
        
        for (String x : answer) {
            if (!x.equals("")) {
                count++;
            } 
        }
        
        String[] answer2 = new String[count];
        int index = 0;
        for (int j = 0; j < answer.length; j++) {
            if (!answer[j].equals("")) {
                answer2[index++] = answer[j];
            }
        }


        return answer2;
    }
}
