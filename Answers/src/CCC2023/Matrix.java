package CCC2023;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Matrix {
    static int MN = 105;
    static int[][] adj = new int[MN][MN];
    static int[] step = new int[MN];
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) {

        Arrays.fill(step, Integer.MAX_VALUE); //set eveyrhting to be as large as possible

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //visited list length
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=n; j++){
                adj[i][j] = sc.nextInt();
            }
        }

        step[1] = 0;
        q.add(1);

        while(!q.isEmpty()){
            int cur = q.poll();
            for(int nxt=1; nxt<=n; nxt++){
                if(adj[cur][nxt] == 1){
                    if(step[nxt] > step[cur] + 1){
                        step[nxt] = step[cur]+1;
                        q.add(nxt);
                    }
                }
            }
        }

        System.out.println(step[n]);
    }
}
