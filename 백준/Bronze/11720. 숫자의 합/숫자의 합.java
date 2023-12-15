import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		   scanner.nextLine();
		String m = scanner.nextLine();
		int sum = 0;
		for (int i=0; i<n; i++) {
			sum += m.charAt(i)-'0';
			
		}System.out.println(sum);
		}
		
	}
