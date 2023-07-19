package CCC2014;

import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0, B = 0;

        int c = sc.nextInt();
        char[] votes = sc.next().toCharArray();
        for(int i = 0; i < c; i++){
            if(votes[i]=='A') A++;
            else B++;
        }

        if(A > B) System.out.println("A");
        else if(A < B) System.out.println("B");
        else System.out.println("Tie");
    }
}
