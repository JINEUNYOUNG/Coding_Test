class Solution {
    public String[] solution(String[] quiz) {
        String[] question = new String[5];
        int i = 0;
        String[] result = new String[quiz.length]; //4문제면 size 4개. true/false를 넣을것.
        for (String x : quiz){
           question = x.split(" ");
            if (question[1].equals("+")) {
                result[i++] = Integer.parseInt(question[0]) + Integer.parseInt(question[2]) == Integer.parseInt(question[4]) ? "O": "X";
            } else if (question[1].equals("-")) {
                result[i++] = Integer.parseInt(question[0]) - Integer.parseInt(question[2]) == Integer.parseInt(question[4]) ? "O": "X";

            }
        }
        //이제 question배열안에는 [0] 숫자 [1] 연산자 [2] 숫자2 [4] 답이 들어있다. 
        
        return result;
    }
}