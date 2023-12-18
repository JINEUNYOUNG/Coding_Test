class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        for (int i=0; i<myString.length(); i++) { //A면 B로, B면 A로 아니면 그대로. answer완성 
           if ( myString.charAt(i) == 'A') {
               answer += "B";
           } else if (myString.charAt(i) == 'B'){
               answer += "A";
           } else {
               answer += myString.charAt(i);}
        }
        
        return answer.contains(pat)? 1 : 0;
    }
}