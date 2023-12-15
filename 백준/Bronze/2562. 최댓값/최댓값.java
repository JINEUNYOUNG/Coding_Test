import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int array[] = new int[9];
		for (int i = 0; i < 9; i++) {
			int a = scanner.nextInt();
			array[i] = a;
        }
		int max = array[0];
        int index = 1;
		for (int j = 0; j < 9; j++) {
			if (max < array[j]) {
				max = array[j];
                index = j+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
		}
	}
	