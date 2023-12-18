class Solution {
    public String solution(String myString) {
        String answer = "";
        String a = "abcdefghijk";
        for (int i=0; i<myString.length(); i++){
            for (int j=0; j<a.length(); j++){
              if (myString.charAt(i) == a.charAt(j)){ //있었다! -> 바로 l로 변환 후 break
                  answer += "l";
                  break;
              }  else if (j==10) { //없었는데, 10번 다 돌았다. -> 그대로 break
                  answer += myString.charAt(i);
                  break;
              }  //없었고, 아직 다 돌지도 않았다 -> continue
              }
            }        return answer;

        }
        
    }
