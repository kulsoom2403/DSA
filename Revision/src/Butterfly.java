import java.util.Scanner;

public class Butterfly {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                // Upper half (excluding middle line)
                for (int i = 1; i < n; i++) {
                    // Left stars
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    // Spaces
                    for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                        System.out.print(" ");
                    }

                    // Right stars
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

                // Middle line
                for (int i = 1; i <= 2 * n - 1; i++) {
                    System.out.print("*");
                }
                System.out.println();

                // Lower half
                for (int i = n - 1; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

                // Blank line between test cases
                if (t > 0) {
                    System.out.println();
                }
            }
        }


}
