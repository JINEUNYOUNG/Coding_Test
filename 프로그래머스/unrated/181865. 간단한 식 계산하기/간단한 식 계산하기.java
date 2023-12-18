class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] a = new String[3];
        a = binomial.split(" ");
        if (a[1].equals("+")) {
            answer = Integer.parseInt(a[0]) + Integer.parseInt(a[2]);
        } else if (a[1].equals("*")) {
            answer = Integer.parseInt(a[0]) * Integer.parseInt(a[2]);
        } else {
            answer = Integer.parseInt(a[0]) - Integer.parseInt(a[2]);

        }
        return answer;
    }
}