package CCC2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        List<char[]> people = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            people.add(sc.next().toCharArray());
        }
        int[] day = {0, 0, 0, 0, 0};
        for(char[] person: people) {
            for(int i = 0; i < 5; i++) {
                if(person[i] == 'Y') {
                    day[i] +=1;
                }
            }
        }

        int high = Arrays.stream(day).sorted().toArray()[4];

        String days = "";
        String[] dayNum = {"1", "2", "3", "4", "5"};
        boolean first = true;
        for(int i = 0; i < 5; i++) {
            if(day[i] == high){
                if(first){
                    days += dayNum[i];
                    first = false;
                }
                else days += ","+dayNum[i];
            }
        }

        System.out.println(days);
    }
}
