class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        //완전히 돌면서 least와 그 자리 index 저장해두고.. 
        //i++하면서 전진! 
        //숫자는 j++해주면 될듯.
        int index = 1;
        int i = 0;
        for (int x=0; x<emergency.length; x++){ //한번 돌면서 지금 최저를 구한다. 
            for (int y = 0; y<emergency.length; y++){ 
                if (emergency[x] < emergency[y]){ 
                    index++;
                }  
            }
            answer[x] = index; //지금 최소인 인덱스를 +1등으로 기록. 
            index = 1;
        }
        //emergency[index] 가 지금 등수 인 것. 
        
        return answer;
    }
}