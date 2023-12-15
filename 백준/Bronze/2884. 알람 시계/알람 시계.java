import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();

		if (minute - 45 < 0) {
			if (hour > 0) {
				hour--;
				minute = 60 - (45 - minute);
			} else {
				hour = 23;
				minute = 60 - (45 - minute);
			}

		} else {
			minute = minute - 45;
		}
		System.out.print(hour+" "+minute);

	}
}