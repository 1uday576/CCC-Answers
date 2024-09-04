import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC13S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        HashSet<String> year;

        while(true){
            y++;
            year = new HashSet<>(List.of(String.valueOf(y).split("")));

            if(String.valueOf(y).length() == year.size()){
                System.out.println(y);
                break;
            }
        }
    }
}
