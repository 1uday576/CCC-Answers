import java.util.Scanner;

public class CCC11S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] student = new char[n];
        char[] answer = new char[n];

        for (int i = 0; i < n; i++) {
            student[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < n; i++) {
            answer[i] = sc.next().charAt(0);
        }

        int right = 0;
        for (int i = 0; i < n; i++) {
            right += answer[i] == student[i]
                    ? 1
                    : 0;
        }

        System.out.println(right);
    }
}
