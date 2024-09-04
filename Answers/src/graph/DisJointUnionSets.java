public class DisJointUnionSets {
    static int MN = 1005;
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
}
