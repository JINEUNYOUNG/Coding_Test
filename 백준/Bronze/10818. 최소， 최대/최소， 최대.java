import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
				array[i] = a;
		}
		int max = array[0];
		int min = array[0];
		for (int j = 1; j < n; j++) {
			if (max < array[j]) {
				max = array[j];
			}
			if (min > array[j]) {
				min = array[j];
			}
		}
		System.out.print(min+" "+max);
		}

		}
	