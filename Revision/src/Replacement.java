import java.util.*;

public class Replacement {

    public static void Replacement(int T, int N, int[] arr) {
        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                arr[i] = 2;
            } else if (arr[i] == 0) {
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Replacement(T, N, arr);

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + (i == N - 1 ? "" : " "));
        }
        System.out.println();

        sc.close();
    }
}
