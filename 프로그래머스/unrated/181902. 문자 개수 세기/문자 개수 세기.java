class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

       for (int i = 0; i < my_string.length(); i++) {
         char ch = my_string.charAt(i);

            // 알파벳인 경우에만 처리
            if ('A' <= ch && ch <= 'Z') {
                int index = ch - 'A'; // A = 65
                answer[index]++; //B는 66이니까 65빼면 1번 인덱스 
            } else if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a'+26 ; //a = 97
                answer[index]++; //b는 98이니까 a 빼면 1번 인덱스......면 안되는디 28번 ㅇ이어야됨 
            }
        }
        return answer;
    }
}