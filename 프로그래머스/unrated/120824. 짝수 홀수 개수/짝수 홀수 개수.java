class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int a = 0; //홀수
        int b = 0; //짝수 
        for (int x : num_list){
            if (x % 2 == 1) {
                a++;
            } else {b++;}
        } 
        answer[0] = b;
        answer[1] = a;
        return answer;
    }
}