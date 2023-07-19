package CCC2011;

import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int M = sc.nextInt();

        String message = "The balloon does not touch ground in the given time.";

        for(int t = 1; t <= M; t++){
            double A = -6 * Math.pow(t, 4) + h * Math.pow(t, 3) + 2 * Math.pow(t, 2) + t;
            if(A <= 0) {
                message ="The balloon first touches ground at hour:"+"\n"+t;
                break;
            }
        }

        System.out.println(message);
    }
}
