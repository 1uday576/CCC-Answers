package CCC2011;

import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();

        int answer;
        int c = 2;
        while(true){
            if(Math.abs(t1-t2) == t1-t2){
                c++;
                answer = t1 - t2;
                t1 = t2;
                t2 = answer;
            }else{
                System.out.println(c);
                break;
            }
        }
    }
}
