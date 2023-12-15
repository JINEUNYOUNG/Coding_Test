import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double array[] = new double[n];
		double sum = 0;
		double sum1 = 0;
		double max = 0;

		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
			sum += array[i];
			if (i < n  && array[i] > max) {
			    max = array[i];
			}
		}
		for (int i = 0; i < n; i++) {
			array[i] = array[i] * 100 / max;
			if (array[i] > 100) {
				array[i] = 100;
			}
			sum1 += array[i];

		}
		System.out.println(sum1/n);
	}
}