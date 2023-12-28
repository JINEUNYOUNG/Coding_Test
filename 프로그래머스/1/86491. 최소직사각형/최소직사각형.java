class Solution {
    public int solution(int[][] sizes) {
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