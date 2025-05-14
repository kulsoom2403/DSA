import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class May_14 {



        private static final int MOD = 1_000_000_007;

        public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
            int[][] T = getTransformationMatrix(nums);
            int[][] T_pow = matrixPow(T, t);
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            long[] result = new long[26];
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    result[j] = (result[j] + 1L * freq[i] * T_pow[i][j]) % MOD;
                }
            }

            long total = 0;
            for (long val : result) {
                total = (total + val) % MOD;
            }

            return (int) total;
        }

        private int[][] getTransformationMatrix(List<Integer> nums) {
            int[][] T = new int[26][26];
            for (int i = 0; i < 26; i++) {
                int steps = nums.get(i);
                for (int k = 1; k <= steps; k++) {
                    T[i][(i + k) % 26]++;
                }
            }
            return T;
        }

        private int[][] matrixPow(int[][] matrix, int power) {
            int size = matrix.length;
            int[][] result = new int[size][size];
            // Initialize result as identity matrix
            for (int i = 0; i < size; i++) {
                result[i][i] = 1;
            }
            while (power > 0) {
                if ((power & 1) == 1) {
                    result = multiplyMatrices(result, matrix);
                }
                matrix = multiplyMatrices(matrix, matrix);
                power >>= 1;
            }
            return result;
        }

        private int[][] multiplyMatrices(int[][] A, int[][] B) {
            int size = A.length;
            int[][] C = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int k = 0; k < size; k++) {
                    if (A[i][k] == 0) continue;
                    for (int j = 0; j < size; j++) {
                        C[i][j] = (int) ((C[i][j] + 1L * A[i][k] * B[k][j]) % MOD);
                    }
                }
            }
            return C;
        }


    public static void main(String[] args) {
        String s = "abcyy";
        int t = 2;
        List<Integer> list = Arrays.asList(
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2
        );
        May_14 obj = new May_14();
        int result = obj.lengthAfterTransformations(s,t,list);
        System.out.println(result);

    }

}
