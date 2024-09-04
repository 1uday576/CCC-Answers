import java.util.*;

public class CCC18J5 {
    static int MN = 10005;
    static ArrayList<Integer>[] adj = new ArrayList[MN];
    static int[] step = new int[MN];
    static boolean[] endPage = new boolean[MN];
    static void dfs(int cur, int steps){
        step[cur] = steps;
        for(int nxt : adj[cur]){
            if(step[nxt] > step[cur]  +1){
                dfs(nxt, steps + 1);
            }
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i < MN; i++) adj[i] = new ArrayList<>();
        Arrays.fill(step, Integer.MAX_VALUE);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            int numPages = sc.nextInt();
            if(numPages ==0) endPage[i] = true;
            for (int j = 0; j < numPages; j++) {
                int nextPage = sc.nextInt();
                adj[i].add(nextPage);
            }
        }

        dfs(1, 1);

        boolean allVisited = true;
        int shortestPath = Integer.MAX_VALUE;
        for(int i = 1; i<=n; i++){
            if(step[i] == Integer.MAX_VALUE){
                allVisited = false;
            }
            if(endPage[i]){
                shortestPath = Math.min(shortestPath, step[i]);
            }
        }

        System.out.println(allVisited ? "Y":"N");
        System.out.println(shortestPath);
    }
}
