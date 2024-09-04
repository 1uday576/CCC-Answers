import java.util.Scanner;

public class CCC22S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int combinations = 0;

        if(n % 4 == 0) combinations++;
        if(n % 5 == 0) combinations++;
        if((n -(n%4) * 4 % 5) ==0) combinations++;
        if((n -(n%5) * 5 % 4) ==0) combinations++;

        System.out.println(combinations);
    }
}
