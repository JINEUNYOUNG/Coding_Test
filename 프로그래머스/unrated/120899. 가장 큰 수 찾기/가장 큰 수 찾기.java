class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int i = 0;
        int index = 0;
        for (int x : array){
            if(max < x){
                max = x;
                index = i;
            }
            i++;
        }
        return new int[]{max,index};
    }
}