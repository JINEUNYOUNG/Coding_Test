class Solution {
    public int solution(int[] array, int n) {
        //array를 돌면서 n이랑 차이를 기록해두는 array2
        //array2를 돌면서 가장 낮은 곳 인덱스를 기억
        //그인덱스로 출력
        int answer = 0;
        int[] array2 = new int[array.length];
        
        int i = 0 ;
        for (int x : array){
            array2[i] = Math.abs(x-n);
            i++;
        }
        int least = array2[0]; 
        int index = 0;
        boolean check = false;
        for (int j = 1 ; j < array2.length; j++){
            if ( least > array2[j] ) {
                least = array2[j];
                index = j;
                check = false;
            } else if (least == array2[j]){ //여기로 돌면 더 작은수 리턴. 
                if (array[index]>array[j]){ 
                    answer = array[j];
                    check = true;
                } else {
                    answer = array[index];
               } 
            }
        }
        if (check){return answer;}
        answer = array[index];//무조건 덮으면 안되고... 만
        
        return answer;
    }
}