package ConstoMinimo;

import java.util.List;

public class CostoMinimo {
    public static int minCost(List<List<Integer>> cost) {
        if (cost == null || cost.isEmpty()) {
            return 0;
        }

        int n = cost.size();
        int[][] dp = new int[n][3];

        dp[0][0] = cost.get(0).get(0);
        dp[0][1] = cost.get(0).get(1);
        dp[0][2] = cost.get(0).get(2);

        for (int i = 1; i < n; i++) {
            dp[i][0] = cost.get(i).get(0) + Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = cost.get(i).get(1) + Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = cost.get(i).get(2) + Math.min(dp[i-1][0], dp[i-1][1]);
        }

        return Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
    }

    public static void main(String[] args) {
        List<List<Integer>> cost1 = List.of(
                List.of(1, 2, 2),
                List.of(2, 3, 3),
                List.of(3, 3, 1)
        );
        System.out.println(minCost(cost1)); // Expected output: 4

        List<List<Integer>> cost2 = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9),
                List.of(10, 11, 12)
        );
        System.out.println(minCost(cost2)); // Expected output: 21
    }


}
