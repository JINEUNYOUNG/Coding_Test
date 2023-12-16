class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int start = 0;
        int end = 0;
        
        for (int i=0; i<parts.length; i++) { // 0 1 2 3 네번 돌거고, 
            start = parts[i][0];
            end = parts[i][1];
            answer += my_strings[i].substring(start,end+1);
        }
    
        return answer;
    }
}