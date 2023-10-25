import java.util.Scanner;

public class CCC19S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next(); //Get the sequence
        char[] list = n.toCharArray(); //Get the sequence as a list of characters
        int[][] grid = {
                {1, 2},
                {3, 4}}; //The grid that will be flipped around

        int h = 0;//The horizontal tracker
        int v = 0;//The vertical tracker

        for (char c:
             list) {
            if(c == 'H') h++;
            else v++;
        }

        if(h % 2 != 0){//If the h is not 0 that means that the grid will be flipped horizontally
            int[] a = grid[0];
            int[] b = grid[1];
            grid[0] = b;
            grid[1] = a;
        }

        if(v % 2 != 0){//If the v is not 0 that means that the grid will be flipped vertically
            int[] a = {grid[0][1], grid[0][0]};
            int[] b = {grid[1][1], grid[1][0]};
            grid[0] = a;
            grid[1] = b;
        }

        System.out.println(grid[0][0] + " " + grid[0][1] + '\n' +
                           grid[1][0] + " " + grid[1][1]);
    }
}
