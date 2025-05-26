public class Que75_25 {

        public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            int[] goal = new int[n];
            goal[0] = cost[0];
            goal[1] = cost[1];

            for(int i = 2; i < n;i++) {
                goal[i] = cost[i] + Math.min(goal[i-1],goal[i-2]);

            }
            return Math.min(goal[n-1],goal[n-2]);
        }

    public static void main(String[] args) {
        int[] cost ={10,20,30};
        Que75_25 obj = new Que75_25();
        int result = obj.minCostClimbingStairs(cost);
        System.out.println(result);
    }
}
