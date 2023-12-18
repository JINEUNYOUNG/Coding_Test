import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        int size = 0;
//        str_list = new String[]{"u", "u", "r", "r", "r"};
        String array = "";
        for (int i = 0; i<str_list.length; i++) { //r l
            if (str_list[i].equals("l")) {
                array = "l"; 
                size = i;
                break;
            } else if (str_list[i].equals("r")) { //r 이 되고, size 는 1.
                array = "r";
                size = str_list.length-i-1;
                break;
            }
            
        }
        String[] answer = new String[size]; //1
        int i = 0;
        boolean s = false;
        if (array == "") {
            return new String[]{}; //array가 비었으면(l r 이 없으면) 빈 리스트 
        } else if (array.equals("l")) {
            //l이 먼저나오면.. 전에 나오는 애들만 
            for (String x : str_list) {
                if ( x.equals("l")) {
                    break;
                } else if (i < answer.length ){
                    answer[i++] = x;
                }
            }
            
        } else if (array.equals("r")){ //여기를 돌아.. 
           for (String x : str_list) { // r l
                if (x.equals("r")&&(!s)) {
                    s = true;
                } else if (s) {
                    answer[i++] = x; // a[0] = l 끝.. 맞는디 
                }
                //r뒤에 있는 문ㅌ자열만 
            }   
        }
        return answer;
    }
}