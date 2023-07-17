package CCC2023;

import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int c = sc.nextInt();

        int score = (p * 50) - (c * 10);

        if(p > c) score += 500;
        System.out.println(score);
    }
}
