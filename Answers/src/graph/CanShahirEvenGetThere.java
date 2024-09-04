import java.util.*;

public class CanShahirEvenGetThere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //visited list length
        int m = sc.nextInt(); //number of edges
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MN = 2005;
        boolean[] visited = new boolean[MN];
        Queue<Integer> queue = new LinkedList<>();

        ArrayList<Integer>[] adj = new ArrayList[MN];
        for (int i=0; i<n+5; i++) {
            adj[i] = new ArrayList<>();
        }

        while(m-->0){
            int x = sc.nextInt(), y = sc.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }

        visited[a] = true;

        queue.add(a);

        while(!queue.isEmpty()){
            int current = queue.poll();

            for(int neighboor : adj[current]){
                if(!visited[neighboor]){
                    visited[neighboor] = true;
                    queue.add(neighboor);
                }
            }
        }

        if(visited[b]){
            System.out.println("GO SHAHIR!");
        }else{
            System.out.println("NO SHAHOR!");
        }
    }
}
