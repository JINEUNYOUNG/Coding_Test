
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 1;
        int count = 1;
        int start = 1;
        int end = 1;

        while (end != a) { //아닌동안 돌리니까 처음부터 count=1
            if (sum == a){
                count++;
                end++;
                sum = sum+=end;
            } else if (sum > a){
                sum = sum-start;
                start++;
            } else {
                end++;
                sum+=end;
            }
        }
        System.out.println(count);
    }
}
