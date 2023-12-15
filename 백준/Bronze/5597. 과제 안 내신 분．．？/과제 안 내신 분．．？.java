import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int array[] = new int[30];
		
        for (int k=0;k<30-2;k++) {
        	int a = scanner.nextInt();
        	array[a-1] = a;
        }
		
		
		for (int i=0; i<30; i++) {
			if (array[i]==0) {
				System.out.println(i+1);
		}
        }
	}
}