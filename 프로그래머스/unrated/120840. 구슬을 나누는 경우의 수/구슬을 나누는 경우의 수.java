class Solution {
    public int solution(int balls, int share) {
        long answer = 1;

        for (int i = 0; i < share; i++) {
            answer *= (balls - i); // 이 부분은 n! / (n-m)!을 계산
            answer /= (i + 1);      // 여기서는 m!로 나누어주는 부분
        }

        return (int) answer;
    }
}
