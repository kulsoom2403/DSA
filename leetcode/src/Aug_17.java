public class Aug_17 {

        public double new21Game(int n, int k, int maxPts) {
            if(k == 0 || n >= k+maxPts -1) return 1.0;

            double[] dp = new double[n+1];
            dp[0] = 1.0;
            double window = 1.0;
            double ans = 0.0;

            for(int i = 1; i <= n;i++){
                dp[i] = window /maxPts;
                if( i < k) window += dp[i];
                else ans += dp[i];
                if(i - maxPts >= 0)
                    window -= dp[i - maxPts];
            }
            return ans;
        }

    public static void main(String[] args) {
        int n = 8;
        int k = 2;
        int max = 30;
         Aug_17 obj = new Aug_17();
         double result = obj.new21Game(n,k,max);
        System.out.println(result);
    }
}
