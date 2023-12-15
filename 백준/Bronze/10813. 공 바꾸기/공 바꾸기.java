import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int array[] = new int[n];
		
        for (int k=0;k<n;k++) {
            array[k]=k+1;
        }
		
		
		for (int i=0; i<m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
            int x = array[a-1];
            array[a-1]= array[b-1];
            array[b-1] = x;
			}
		
		for (int z=0; z<n; z++){
            System.out.print(array[z]+" ");
        }
	}
}