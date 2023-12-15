import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int array[] = new int[n];
		
		
		for (int i=0; i<m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int k = scanner.nextInt();
			
			for (int j=a-1; j<=b-1;j++){
				array[j] = k;
			}
		}
		for (int z=0; z<n; z++){
            System.out.print(array[z]+" ");
        }
	}
}