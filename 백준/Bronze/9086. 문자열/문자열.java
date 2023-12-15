import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			String a = scanner.nextLine();	
			char b = a.charAt(0);
			char c = a.charAt(a.length()-1);
			System.out.println(Character.toString(b)+Character.toString(c));
		}
	}
}