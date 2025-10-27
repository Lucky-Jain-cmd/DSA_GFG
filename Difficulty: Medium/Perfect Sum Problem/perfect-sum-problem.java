class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] arr, int target) {
        // code here
         int n = arr.length;

        int[][] dp = new int[n + 1][target + 1];

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {

                dp[i][j] = dp[i - 1][j];

                if (j >= arr[i - 1]) {
                    dp[i][j] += dp[i - 1][j - arr[i - 1]];
                }
            }
        }
        return dp[n][target];
    
    }
}