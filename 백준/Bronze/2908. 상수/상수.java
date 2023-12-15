import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        for (int i = 0; i < 2; i++) {
            String input = sc.next();
            char[] numbers = input.toCharArray();

            for (int j = 0; j < numbers.length / 2; j++) {
                char temp = numbers[j];
                numbers[j] = numbers[numbers.length - 1 - j];
                numbers[numbers.length - 1 - j] = temp;
            }

            int num = Integer.parseInt(String.valueOf(numbers));
            if (num > a) {
                a = num;
            }

        }
        System.out.println(a);
    }
}