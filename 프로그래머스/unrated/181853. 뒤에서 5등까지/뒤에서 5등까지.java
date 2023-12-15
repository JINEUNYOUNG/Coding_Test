class Solution {
    public int[] solution(int[] num_list) {
        int a =0;
        boolean swapped;

        do{ //do{} while(); while~동안 do를 반복하라. 
            swapped = false;    
            for (int i=0; i<num_list.length-1; i++){
                if (num_list[i] > num_list[i+1]) { //오른쪽이 더 작으면 자리바꾸기 
                    a = num_list[i];
                    num_list[i] = num_list[i+1];
                    num_list[i+1] = a;
                    swapped = true;
                }
            }
        } while (swapped);
        return new int[]{num_list[0], num_list[1], num_list[2], num_list[3], num_list[4]};

    }
}
