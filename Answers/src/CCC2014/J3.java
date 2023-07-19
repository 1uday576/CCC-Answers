package CCC2014;

import java.util.Scanner;

public class J3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalA = 100, totalB = 100;
        int diceA, diceB;
        int i = sc.nextInt();

        for(; i > 0; i--){
            diceA = sc.nextInt();
            diceB = sc.nextInt();

            if(diceA > diceB) totalB -= diceA;
            else if (diceB > diceA) totalA -= diceB;
        }

        System.out.println(totalA + "\n" + totalB);
    }
}
