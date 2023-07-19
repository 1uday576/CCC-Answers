package CCC2011;

import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int antennae = sc.nextInt();

        int eyes = sc.nextInt();

        if(antennae <= 6 && eyes >= 2){
            System.out.println("VladSaturnian");
        }
        if(antennae <= 2 && eyes <= 3) {
            System.out.println("GraemeMercurian");
        }
        if(antennae >= 3 && eyes <= 4){
            System.out.println("TroyMartian");
        }
    }
}
