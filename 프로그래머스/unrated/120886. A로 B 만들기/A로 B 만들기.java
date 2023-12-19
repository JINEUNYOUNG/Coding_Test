import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int[] engbef = new int[26];
        int[] engaft = new int[26];

        char[] bef = before.toCharArray();
        char[] aft = after.toCharArray();
        for (char x : bef){
            engbef[x - 97]++;
            //a는 97 -> 0 으로 만들어야함. 
        }
        for (char y : aft){
            engaft[y - 97]++;
        }

        return Arrays.equals(engbef, engaft) ? 1 : 0;
    }
}