class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = my_string.split(" ");
        int count = 0;
        
        // 불필요한 공백이 아닌 문자열의 개수를 센다. 리스트 수 몇개로 할지 
        for (String str : answer) {
            if (!str.isEmpty()) {
                count++;
            }
        }

        // 새로운 배열을 생성하여 공백없으면 넣어줌 
        String[] result = new String[count];
        int index = 0;
        for (String str : answer) {
            if (!str.isEmpty()) {
                result[index++] = str;
            } //추가할때 index +1 해주는 방식 
        }
        return result;
    }
}