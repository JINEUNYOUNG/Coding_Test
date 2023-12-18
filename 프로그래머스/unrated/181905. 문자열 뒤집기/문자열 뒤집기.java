class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        //0~s-1까지는 그대로, 
        for (int i=0; i<s; i++){
            answer += my_string.charAt(i);
        }
        for (int i=e; i>=s; i--) {
            answer += my_string.charAt(i);
        }
        if (my_string.length() > e) {
            for (int i=e+1; i<my_string.length(); i++) {
                answer+= my_string.charAt(i);
            }
        }
        return answer;
    }
}