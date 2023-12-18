class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for (int i=0; i<my_string.length(); i++){
            for (int j=0; j<indices.length; j++){
                if (i == indices[j]) { //인덱스가 일치 했으면 넘기기. 
                    break;
                } else if (j == indices.length-1) { 
                    answer += my_string.charAt(i); break;} //마지막 턴이었으면 추가하고 끝. 
            }
        }
        return answer;
    }
}