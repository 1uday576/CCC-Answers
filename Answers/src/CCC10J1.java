import java.util.Scanner;

public class CCC10J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        switch(i) {
            case 1, 9, 10-> System.out.println("1");
            case 2, 3, 7, 8-> System.out.println("2");
            case 4, 5, 6-> System.out.println("3");
        }
    }
}
