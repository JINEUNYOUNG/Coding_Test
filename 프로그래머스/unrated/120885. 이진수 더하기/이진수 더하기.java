class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int first = Integer.parseInt(bin1,2);
        int second = Integer.parseInt(bin2,2);
        int sum = first + second;
        answer = Integer.toBinaryString(sum);
        return answer;
    }
}