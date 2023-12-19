class Solution {
    public int solution(int n) {
        int sum = 1; //합계를 저장하는 변수 
        int fac = 0; //최대 팩토리얼을 기록하는 변수 
            for (int i = 1; i <= 10; i++){
                if ((sum < n)&&((sum * i)<n)){  
                    //합계가 n을 안넘어간 경우, 합계더하고 팩토리얼+1 
                    sum *= i;
                    fac++;
                } else if ((sum * i) > n) { 
                    //한번 더 하면 넘는 경우 
                    return fac;
                }  else if (sum * i % n == 0) { 
                    //합계가 딱 떨어지는 경우
                    sum *= i;
                    fac++;
                }
            }
            

        return fac;
    }
}