package CCC2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC20S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        LinkedHashMap<Integer, Integer> inputs = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            inputs.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        LinkedHashMap<Integer, Integer> resutls = inputs.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), Map::putAll);

        double maxSpeed;
        ArrayList<Integer> time = new ArrayList<>(resutls.keySet());

        for(int i = 0; i < n-1; i++){

        }
    }
}
