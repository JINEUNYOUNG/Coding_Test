class Solution {
    public int solution(int[] num_list) {
        int answer = 0; //합 30 
        int answer2 = 1; //곱 120
        for(int i=0; i<num_list.length; i++){
            answer2 *= num_list[i]; 
            answer += num_list[i];
        }
        answer = answer * answer;
        if (answer2 < answer) {
            return 1;
        } else {
            return 0;
        }
        
    }
}