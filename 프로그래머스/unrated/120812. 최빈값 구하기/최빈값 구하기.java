class Solution {
    public int solution(int[] array) {
        int[] integer = new int[1000]; 
        //인덱스마다 등장하는 빈도 0~9까지 자리를 둠. 
        for (int i = 0; i<array.length; i++) {
            int a = array[i];
            integer[a]++;
        } 
        int index = 0; //max값을 가진 인덱스
        int max = 0;
        boolean isdup = false;
        int i = 0 ;
        while (i < integer.length){ 
            //integer배열을 돌며 가장 큰 인덱스의 값을 반환.  [1,1,2,3,4,5,5]
            if (max == integer[i]){ //같은 경우 중복 표시 해줌 
                isdup = true;
            } else if ((max != integer[i])&&(max<integer[i])) {
                isdup = false;
                max = integer[i];
                index = i;
            }
            i++;
        }
        if (isdup) {
            return -1;
        }
        return index;
    } 
}
