class Solution {
    public int[] solution(int n) {
        int count=0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        int[] answer = new int[count];
        int j = 0;
        for (int k = 1; k <= n; k++){
            if(n % k == 0){
                answer[j++] = k;
            }
        }
        return answer;
    }
}