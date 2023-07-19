package CCC2013;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        while(true) {
            y++;
            Set<Character> year = new HashSet<>();

            char[] num = Integer.toString(y).toCharArray();

            for(char d : num) year.add(d);

            if(year.size() == num.length) {
                System.out.println(y);
                break;
            }
        }
    }
}
