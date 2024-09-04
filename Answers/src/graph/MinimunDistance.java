package graph;

import java.util.*;

public class MinimunDistance {
    static int MN = 2005;
    static ArrayList<Integer>[] adj = new ArrayList[MN];
    static int[] step = new int[MN];
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) {
        Arrays.fill(step, Integer.MAX_VALUE); //set everything to be as large as possible


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //visited list length
        int m = sc.nextInt(); //number of edges
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < MN; i++){
            adj[i]= new ArrayList<>();
        }

        while (m-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }

        step[a] = 0;
        q.add(a);


        while(!q.isEmpty()){
            int cur = q.poll();

            for(int nxt: adj[cur]){
                if(step[nxt] > step[cur] + 1){
                    step[nxt] = step[cur] + 1;
                    q.add(nxt);
                }
            }
        }

        /*
        Can also be used to see if you are able to reach a node from a starting position by checking if the value in the step
        is not equal to the max integer value
         */



        System.out.println(step[b]);
    }

    static void dfs(int cur, int steps){
        step[cur] = steps;
        for(int nxt : adj[cur]){
            if(step[nxt] > step[cur]  + 1){
                dfs(nxt, steps + 1);
            }
        }
    }
}
