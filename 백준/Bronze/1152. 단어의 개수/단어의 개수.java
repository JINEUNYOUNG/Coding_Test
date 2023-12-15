import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss[] = s.split(" ");
        int count = 0;
        for (int i =0; i<ss.length; i++) {
        	if (ss[i] != "") {
        	count++;}
        }
    System.out.println(count);
    
    }
}
