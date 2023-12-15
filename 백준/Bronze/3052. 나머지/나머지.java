import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int array[] = new int[10];
		
        for (int k=0;k<10;k++) {
        	int a = scanner.nextInt();
        	array[k] = a % 42 ;
        } 
        int[] arrayresult = Arrays.stream(array).distinct().toArray();
        System.out.println(arrayresult.length);
		
	}
}