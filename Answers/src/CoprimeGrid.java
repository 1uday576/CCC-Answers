import java.util.Scanner;

public class CoprimeGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n == 1 || m == 1) {
                System.out.println(-1);
                continue;
            }

            int[][] grid = new int[n+5][m+5]; //plus 5 to prevent index out of bounds
            int num =2;

            for(int i = 1; i <=n; i++){

                if(i % 2 ==1) {
                    for(int j = 1; j <=m; j++){
                        grid[i][j] = num;
                        num++;
                        if(num > n * m) num =1;
                    }
                }else {
                    for(int j = 1; j <=m; j++){
                        grid[i][j] = num ;
                        num++;
                        if(num > n * m) num =1;
                    }
                }
            }

        }
    }
}
