import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //주어진문자열길이
        int stack = 0;
        Stack<Integer> s = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++){
            //push연산
            int m = scanner.nextInt();
            while ( m > stack) {
                s.push(stack++);
                result.append("+\n");
            } //stack이 부족하면 쌓는다.
            //pop연산.(같아지면)
            if (m == s.peek()+1){
                s.pop();
                result.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }



        }

        System.out.println(result.toString());

    }
}
