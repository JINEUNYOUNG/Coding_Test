class Solution {
    public int solution(int[][] sizes) {
        //가로 세로를 긴거 작은거로 정렬해두면
        //가장 긴 가로 x 가장 긴 세로 로 구할 수 있을 듯!
        int answer = 0;
        int maxa = 0;
        int maxb = 0;
        for (int[] x : sizes){
            if (x[0] < x[1]){
                int temp = x[0];
                x[0] = x[1];
                x[1] = temp;
            }
        }
        for (int[] x : sizes){
            if (x[0] > maxa){
                maxa = x[0];
            }
            if (x[1] > maxb){
                maxb = x[1];
            }
        }

        
        return maxa * maxb;
    }
}