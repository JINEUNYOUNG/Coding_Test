class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        int[] lenArr = new int[30];
        for(int i = 0; i < strArr.length; i++) {
            lenArr[strArr[i].length()-1]++;
        }
        for(int num : lenArr) {
            if(answer < num) answer = num;
        }
        return answer;
    }
}