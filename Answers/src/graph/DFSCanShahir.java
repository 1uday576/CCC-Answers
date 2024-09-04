import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSCanShahir {
    static boolean[] visited;
    static ArrayList<Integer>[] adj;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //visited list length
        int m = sc.nextInt(); //number of edges
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MN = 2005;
        visited = new boolean[MN];
        Queue<Integer> queue = new LinkedList<>();

        adj = new ArrayList[MN];
        for (int i=0; i<n+5; i++) {
            adj[i] = new ArrayList<>();
        }

        while(m-->0){
            int x = sc.nextInt(), y = sc.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }

        dfs(a);

        if(visited[b]){
            System.out.println("GO SHAHIR!");
        }else{
            System.out.println("NO SHAHOR!");
        }
    }

    static void dfs(int cur){
        visited[cur] = true;
        for(int neighbour: adj[cur]){
            if(!visited[neighbour]){
                dfs(neighbour);
            }
        }
    }
}
