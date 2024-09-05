import java.util.Scanner;

public class Climbing_Stairs {

        public int climbStairs(int n) {
            if(n == 1) {
                return 1;
            }
            else if(n == 2) {
                return 2;
            }
            else if(n == 3) {
                return 3;
            }
            int[] nums = new int[n+1];
            nums[1] = 1;
            nums[2] = 2;
            nums[3] = 3;

            for(int i = 4; i <= n; i++ ){
                nums[i] = nums[i-1] +nums[i-2];
            }

            return nums[n];

        }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sr.nextInt();

        Climbing_Stairs cs = new Climbing_Stairs();
        int number = cs.climbStairs(n);

        System.out.println(number);
    }

}
