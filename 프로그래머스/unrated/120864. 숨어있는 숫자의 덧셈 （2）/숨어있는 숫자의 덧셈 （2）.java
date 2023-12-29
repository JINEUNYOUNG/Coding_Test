class Solution {
    public int solution(String my_string) {
        //my_string을 charAt(i)으로 돌면서.. a이상 z미만인가? 
        //또는 0이상 9미만인가로 나누면 안되낭...
        int answer = 0;
        int number = 0;

        for (int i = 0; i <my_string.length(); i++){

            if ((Character.isDigit(my_string.charAt(i)))&&(number==0)){//숫자고, 지금 넘버가 비어있다면 그냥 더해주기 
                number+=(my_string.charAt(i)-'0');
            } else if ((Character.isDigit(my_string.charAt(i)))&&(number!=0)){ //지금 넘버에 값이 있으면
                number*=10;
                number+=(my_string.charAt(i)-'0');
            } else { //숫자가 아니다. number 초기화 
                answer+=number;
                number=0;
            }
            if (i == my_string.length()-1){ //마지막 턴이면, 
                answer+=number;
                number=0;
            }
            
        }
        return answer;
    }
}