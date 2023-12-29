class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        //string으로 i부터 j까지 돌면서 +=하고 다시 돌아서 카운트 하면? 
        String a = "";
        char n = (char)(k+'0'); //char로 변환 
        for (int l = i; l <= j; l++){
            a+=(l+"");
        }
        for (int o = 0; o < a.length(); o++){
            if (a.charAt(o)==n){
                answer++;
            }
        }
        return answer;
    }
}