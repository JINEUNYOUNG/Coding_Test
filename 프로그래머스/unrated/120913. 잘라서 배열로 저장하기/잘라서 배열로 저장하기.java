class Solution {
    public String[] solution(String my_str, int n) {
        int size = (my_str.length() + n - 1) / n; // 배열 크기 계산

        String[] answer = new String[size];
        int j = 0;

        for (int i = 0; i < my_str.length(); i++) {
            if (i % n == 0) { //만약 i 를 n으로 나눈게 0인 배수 인덱스라면 (0, 6... )
                answer[j] = "";  //문자열 초기화
                j++; //다음배열인덱스지정
            }
            answer[j - 1] += my_str.charAt(i); //++해줬으니 -1해서 str추가 
        }

        return answer;
    }
}
