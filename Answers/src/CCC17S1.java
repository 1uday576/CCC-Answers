import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CCC17S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] swift = new int[n];

        for(int i = 0; i < n; i++) swift[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] sema = new int[n];

        for(int i = 0; i < n; i++) sema[i] = Integer.parseInt(st.nextToken());

        int k = 0;
        int totalSwift = 0;
        int totalSema = 0;
        for(int i = 0; i < n; i++){
            totalSwift = totalSwift + swift[i];
            totalSema = totalSema + sema[i];

            if(totalSema == totalSwift) k = i + 1;
        }

        System.out.println(k);
    }
}
