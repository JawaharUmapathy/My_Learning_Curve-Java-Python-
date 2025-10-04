class Knapsack {
    static int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        int[] dp = new int[W + 1];

        // Loop over each item
        for (int i = 0; i < n; i++) {
            // Go from W down to wt[i] to avoid using updated values prematurely
            for (int w = W; w >= wt[i]; w--) {
                dp[w] = Math.max(dp[w], val[i] + dp[w - wt[i]]);
            }
        }

        return dp[W];
    }
}