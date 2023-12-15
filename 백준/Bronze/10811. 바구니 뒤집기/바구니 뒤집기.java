import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int array[] = new int[n];
		
		
        for (int i=0;i<n;i++) {
        	array[i]=i+1;
        }
        for (int j=0;j<m;j++) {
        	int a = scanner.nextInt();
        	int b = scanner.nextInt();
        	for(int k=0;k<(b-a+1)/2;k++) {
        		int x = array[a+k-1];
        		array[a+k-1]=array[b-k-1];
        		array[b-k-1]=x;
        		
 
        	}
        }
        for (int k=0; k<n;k++) {
        	
        	System.out.print(array[k]+" "); }
	}
}