class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] ex = {"aya", "ye", "woo", "ma"};
        for (String x : babbling){
            for (String y : ex){
                if (x.contains(y)){
                x = x.replace(y,"*");
                }
            }
           
            if (x.matches("[*]+")){
                answer++;
            };
        }
        
       
        return answer;

}
}