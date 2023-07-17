import java.util.Scanner;

public class CCC11J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        int antennae = sc.nextInt();

        System.out.println("");
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
