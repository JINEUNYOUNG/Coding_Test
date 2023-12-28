import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        //array, commands[i부터j까지자르고k번째숫자]
        for (int i= 0; i < commands.length; i++){
                //2부터 5까지 5-2+1 4개. 
                //4개짜리 배열을 만들고 
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int[] arrays = new int [end-start+1]; //start~end까지 배열 4개

            for (int j = 0 ; j  <arrays.length; j++){
                arrays[j] = array[start+j];
            }
            // 추출한 부분 배열을 정렬 (버블정렬)
            for (int k = 0 ; k < arrays.length-1 ; k++){
              for (int j = k+1 ; j < arrays.length; j++){
                if (arrays[k]>arrays[j]){
                    int temp = arrays[k];
                    arrays[k] = arrays[j];
                    arrays[j] = temp;
                }
            }
            }
            
            //그 배열을 정렬
            answer[i] = arrays[commands[i][2]-1];
            
        }
        return answer;
    }
}