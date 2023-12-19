class Solution {
    public String solution(int age) {
        String answer = "";
        String age2 = age + ""; 
        for (int i = 0; i < age2.length(); i++){
          answer += (char) ('a' + age2.charAt(i) - '0');
        }
        
        return answer;
    }
}