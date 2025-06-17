// Take availble n pencil and m eraser in shop, one boy want to buy p pencil and e eraser. Find how many way he will choose p pencil and e eraser.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int e = sc.nextInt();
        
        long pencilWays = 1;
        for (int i = 0; i < p; i++) {
            pencilWays *= (n - i);
            pencilWays /= (i + 1);
        }

        long eraserWays = 1;
        for (int i = 0; i < e; i++) {
            eraserWays *= (m - i);
            eraserWays /= (i + 1);
        }

        long totalWays = pencilWays * eraserWays;
        System.out.println(totalWays);
    }
}
