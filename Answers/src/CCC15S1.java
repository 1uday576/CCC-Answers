import java.util.Scanner;
import java.util.Stack;

public class CCC15S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> list = new Stack<>();

        int cur;

        for (int i = 0; i < n; i++) {
            cur = sc.nextInt();
            if(cur == 0) list.pop();
            else {
                list.push(cur);
            }
        }

        int total = 0;
        int c = list.size();
        if(!list.isEmpty()){
            for (int i = 0; i < c; i++) {
                total += list.pop();
            }
        }
        System.out.println(total);
    }
}
