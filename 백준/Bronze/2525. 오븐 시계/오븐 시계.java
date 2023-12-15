import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		int minute2 = scanner.nextInt();

		if (minute + minute2 >= 60) {
				hour += ((minute+minute2)/60);
				minute = (minute+minute2)%60;
			} else {
			minute += minute2;
		}
		System.out.println((hour >= 24 ? hour-24 : hour) + " " + minute);
		
	}
}