import java.util.Scanner;

public class searching {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();


                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                int x = sc.nextInt();

                int result = -1;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == x) {
                        result = i;
                        break;
                    }
                }

                System.out.println(result);
            }
        }



}
