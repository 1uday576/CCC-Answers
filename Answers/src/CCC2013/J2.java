package CCC2013;

import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String answer = "YES";
        for (char c: input.toCharArray()) {
            if(c != 'I' && c != 'O' && c != 'S' && c != 'H' && c != 'Z' && c != 'X' && c != 'N'){
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }
}
