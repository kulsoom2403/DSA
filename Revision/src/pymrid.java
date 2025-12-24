import java.util.Scanner;

public class pymrid {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            while (T-- > 0) {
                int N = sc.nextInt();

                for (int i = 1; i <= N; i++) {

                    // Print leading spaces (each space = 2 actual spaces)
                    for (int s = 1; s <= N - i; s++) {
                        System.out.print("  ");
                    }

                    // Print stars
                    for (int star = 1; star <= 2 * i - 1; star++) {
                        System.out.print("* ");
                    }

                    System.out.println();
                }
            }
            sc.close();
        }


}
