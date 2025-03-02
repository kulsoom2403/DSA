class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // Step 1: Create DP Table
        int[][] dp = new int[m + 1][n + 1];

        // Step 2: Fill the DP Table (Finding LCS Length)
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Step 3: Build the Shortest Common Supersequence from DP Table
        StringBuilder sb = new StringBuilder();
        int i = m, j = n;

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                sb.append(str1.charAt(i - 1));
                i--;
            } else {
                sb.append(str2.charAt(j - 1));
                j--;
            }
        }

        // Add remaining characters of str1
        while (i > 0) {
            sb.append(str1.charAt(i - 1));
            i--;
        }

        // Add remaining characters of str2
        while (j > 0) {
            sb.append(str2.charAt(j - 1));
            j--;
        }

        // Reverse the result since we built it from the end
        return sb.reverse().toString();
    }

    // Driver Code
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "abac";
        String str2 = "cab";
        System.out.println(sol.shortestCommonSupersequence(str1, str2)); // Output: "cabac"
    }
}
