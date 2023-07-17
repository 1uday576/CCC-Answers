package CCC2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        HashMap<String, Integer> table = new HashMap<>();
        table.put("Poblano", 1500);
        table.put("Mirasol", 6000);
        table.put("Serrano", 15500);
        table.put("Cayenne", 40000);
        table.put("Thai", 75000);
        table.put("Habanero", 125000);

        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        int shu = 0;

        for(String name: list){
            shu += table.get(name);
        }
        System.out.println(shu);
    }
}
