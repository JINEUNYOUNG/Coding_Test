import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();
        for (int z = 0; z < n; z++) {
            String s = scanner.nextLine();
            String[] ss = s.split(" ");

            int r = Integer.parseInt(ss[0]);
            String string = ss[1];

            for (int i = 0; i < string.length(); i++) {
                for (int j = 0; j < r; j++) {
                	result.append(string.charAt(i));
                	
                }
            }
            result.append("\n");
        } System.out.println(result.toString());
    }
}