import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer="";
        for (char x : a.toCharArray()) {

            if (Character.isUpperCase(x) == true) {
                answer += Character.toLowerCase(x); 
             } else {
                answer += Character.toUpperCase(x); 
            }
         }
         System.out.println(answer);
    }
}