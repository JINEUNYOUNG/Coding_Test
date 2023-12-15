
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
	Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    int total = 0;
    char[] ar = new char[a.length()];
	    for (int i = 0; i <a.length(); i++) {
		    	ar[i] = a.charAt(i);
		    	
	}
	    for (int j=0; j<a.length(); j++) {
	        if (ar[j] == 'A' || ar[j] == 'B' || ar[j] == 'C') {
	    		total = total + 3;
	    	} else if (ar[j] == 'D' || ar[j] == 'E' || ar[j] == 'F') {
	    		total = total + 4;
	    	} else if (ar[j] == 'G' || ar[j] == 'H' || ar[j] == 'I') {
	    		total = total + 5;
	    	} else if (ar[j] == 'J' || ar[j] == 'K' || ar[j] == 'L') {
	    		total = total + 6;
	    	} else if (ar[j] == 'N' || ar[j] == 'M' || ar[j] == 'O') {
	    		total = total + 7;
	    	} else if (ar[j] == 'P' || ar[j] == 'Q' || ar[j] == 'R' || ar[j] =='S') {
	    		total = total + 8;
	    	} else if (ar[j] == 'T' || ar[j] == 'U' || ar[j] == 'V'){
	    		total = total + 9;
	    	} else {
	    		total = total + 10;
	    	}
		    		
	    	
	    }
	    System.out.println(total);
}
}
