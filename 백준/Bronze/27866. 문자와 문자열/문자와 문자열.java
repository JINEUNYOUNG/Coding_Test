import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int i = scanner.nextInt();
		
		if (s.length() >= i) {
			System.out.println(s.charAt(i-1));
		}
		
	}
}