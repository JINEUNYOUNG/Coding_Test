class Solution {
    public int solution(int order) {
        int answer = 0;
        String strorder = order + "";
        for (int i = 0; i < strorder.length(); i++){
            if (((strorder.charAt(i)-'0') != 0) && (strorder.charAt(i)-'0') % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}