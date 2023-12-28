class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n]; //n개짜리 학생 리스트를 만든다. 
        int answer = 0;
        for (int x : lost){
            students[x-1]--; //잃었으면 -1
        }
        for (int x : reserve){ //여벌있으면 +1
            students[x-1]++;
        }
        for (int i = 0; i < n ; i++){
            if (students[i] == 1){
                if ((i-1 >= 0) && (students[i-1]==-1)){
                    students[i-1]++;
                    students[i]--;

                } else if ((i+1 < n) && (students[i+1]==-1)){
                    students[i+1]++;
                    students[i]--;
                } 
            }
        }
        
        for (int x : students){
            if (x >= 0){
                answer++;
            }
        }
        return answer;
    }
}