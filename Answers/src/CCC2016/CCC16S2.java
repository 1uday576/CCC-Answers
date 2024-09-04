package CCC2016;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CCC16S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt(); //question to solve
        int n = sc.nextInt();

        int[] dmoji = new int[n];
        int[] peg = new int[n];

        for (int i = 0; i < n; i++) {
            dmoji[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            peg[i] = sc.nextInt();
        }

        //ascending
        Arrays.sort(dmoji);
        Arrays.sort(peg);

        //question one
        if(q == 1){
            int minTotalSpeed = 0;
            for (int i = n-1; i >=0; i--) {
                minTotalSpeed += Math.max(dmoji[i], peg[i]);
            }
            System.out.println(minTotalSpeed);
        }else{
            int maxTotalSpeed = 0;
            for (int i = n-1, j = 0; i >=0; i--, j++) {
                maxTotalSpeed += Math.max(dmoji[i], peg[j]);
            }
            System.out.println(maxTotalSpeed);
        }
    }
}
