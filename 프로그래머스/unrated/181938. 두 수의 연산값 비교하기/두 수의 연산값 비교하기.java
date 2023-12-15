class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        if (Integer.parseInt(sa + sb)>=(2*a*b)) {
            answer = Integer.parseInt(sa + sb);
        } else { answer= 2*a*b; }
        
        
        return answer;
    }
}