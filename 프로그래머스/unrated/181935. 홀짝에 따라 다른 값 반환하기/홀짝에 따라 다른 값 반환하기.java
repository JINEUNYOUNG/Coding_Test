class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            int j = 1;
            j = n / 2 +1; //n이 5면, j=3. 1,3,5를 더해야함.
            for (int i=0; i<j; i++ ) {
                answer += ((i * 2) + 1);
            }   
        } else { //짝수면 10일때 j=5, 0,1,2,3,4,5  돌아서 
            int j = n /2;
            for (int i=0; i<=j; i++ ) {
                answer += Math.pow(i * 2,2);
            }   
        }
        return answer;
    }
}