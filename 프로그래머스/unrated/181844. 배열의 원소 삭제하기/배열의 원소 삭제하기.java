import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> resultList = new ArrayList<>();
        int count =0;
        
        for (int i=0; i<arr.length; i++){ //arr을 돌면서 하나씩, 
            count = 0; //초기화
            for (int j=0; j<delete_list.length; j++) { //delete를 돌면서 
                if (arr[i] == delete_list[j]) { // 비교하고, 같으면 count+1 
                    count ++;
                }
            }
             if (count == 0) {
                 resultList.add(arr[i]); 
            }
        }
        int[] answer = new int[resultList.size()];
        for (int i=0; i<answer.length; i++){
          answer[i] = resultList.get(i);
        }
        return answer;
    }
}