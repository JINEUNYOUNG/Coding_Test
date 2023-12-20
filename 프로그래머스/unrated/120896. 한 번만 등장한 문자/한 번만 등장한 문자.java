class Solution {
    public String solution(String s) {
        int[] eng = new int[26];
        String answer = "";
        for (int i=0; i<s.length(); i++) {
            eng[s.charAt(i)-'a']++; //a는 0으로 들어가야함. 
        }
        for (int j=0; j < 26 ; j++) {
            if(eng[j]==1){
                answer+=(char)(j+'a');
            }
        }
        return answer;
    }
}