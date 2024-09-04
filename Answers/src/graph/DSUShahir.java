package graph;

import java.util.Scanner;

public class DSUShahir {
    static int MN = 2005;
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
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < MN; i++) par[i] = i;

        while(m-- >0){
            int x = sc.nextInt(), y = sc.nextInt();
            union(x, y);
        }

        if(find(a) == find(b)) System.out.println("GO SHAHIR!");
        else System.out.println("NO SHAHIR!");
    }
}
