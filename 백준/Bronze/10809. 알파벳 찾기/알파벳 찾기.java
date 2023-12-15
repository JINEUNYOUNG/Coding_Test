import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String m = scanner.nextLine();
		char abc[] = new char[26];
		int z[] = new int[26];
		char aa = 0;
		for (int i = 0; i < 26; i++) {
			abc[i] = (char) ('a' + i);
			z[i] = -1;
			for (int j = 0; j < m.length(); j++) {
				aa = m.charAt(j);
				if (abc[i] == aa && z[i] == -1) {
					z[i] = j;
					break;
				}

			}
		}
		for (int x = 0; x < 26; x++) {
			System.out.print(z[x] + " ");
		}
	}
}
