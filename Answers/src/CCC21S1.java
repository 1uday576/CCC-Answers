import java.util.Scanner;

public class CCC21S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] base = new double[n+1];
        double[] height = new double[n];

        for (int i = 0; i < n + 1; i++) {
            base[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        double answer = 0;
        for (int i = 0; i < n; i++) {
            answer += (height[i]*(base[i] + base[i+1])) / 2;
        }

        System.out.println(answer);
    }
}
