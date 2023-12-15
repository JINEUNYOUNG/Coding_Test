import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i=1;i<=n;i++) {
			for (int k=n;k>i;k--) {
				System.out.print(" ");}
			for (int j=0;j<i;j++) {
		    System.out.print("*");
		    }
		System.out.println();
		}
	}
}
