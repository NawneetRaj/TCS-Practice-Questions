//Take n number of pizz and k number of flour and print maximum consecutive flour pizza.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int[] count = new int[100001];
        int start = 0, max = 0, distinct = 0;

        for (int i = 0; i < n; i++) {
            if (count[a[i]] == 0) distinct++;
            count[a[i]]++;

            while (distinct >= k) {
                count[a[start]]--;
                if (count[a[start]] == 0) distinct--;
                start++;
            }
            max = Math.max(max, i - start + 1);
        }
        System.out.println(max);
    }
}
