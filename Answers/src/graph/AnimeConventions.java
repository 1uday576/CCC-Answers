package graph;

import java.util.Scanner;

public class AnimeConventions {
    static int MN = 100005;
    static int[] par = new int[MN];

    static int find(int cur){
        if(par[cur] == cur) return cur;
        return par[cur] = find(par[cur]);
    }

    static void union(int x, int y){
        x  = find(x);
        y = find(y);
        if(x != y) par[x] = y;
    }
    public static void main(String[] args) {
        for(int i = 0; i < MN; i++) par[i] = i;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        while(q-- > 0){
            String action = sc.next();
            int x = sc.nextInt(), y = sc.nextInt();

            if(action.equals("A")){
                union(x, y);
            }else{
                System.out.println(find(x) == find(y)
                        ? "Y"
                        : "N");
            }
        }
    }
}
