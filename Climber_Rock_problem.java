//Take n number of rocks , a climber cureent position is i , climber skip atmost x rock. find the number of way a climber can climb to reach teh peak.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = sc.nextInt(), x = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[i] = 1;
        for (int j = i + 1; j <= n; j++) {
            for (int k = 1; k <= x && j - k >= i; k++) {
                dp[j] += dp[j - k];
            }
        }
        System.out.println(dp[n]);
    }
}
