import java.util.Arrays;

public class Spril_2 {

        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            int top = 0,bottom = n - 1;
            int left = 0,right = n -1;
            int num = 1;

            while(left <= right && top <= bottom){
                for(int i = left;i <= right;i++) {
                    matrix[top][i] = num++;
                }
                top++;
                for(int j = top;j <= bottom;j++){
                    matrix[j][right] = num++;

                }
                right--;
                if(top <= bottom){
                    for(int i = right; i>= left;i--){
                        matrix[bottom][i] = num++;
                    }
                    bottom--;
                }
                if(left <= right){
                    for(int i = bottom; i>= top;i--){
                        matrix[i][left] = num++;
                    }
                    left++;
                }
            }
            return matrix;


        }

    public static void main(String[] args) {
        int n = 5;
        Spril_2 obj = new Spril_2();
        int[][] result = obj.generateMatrix(n);
        for(int[] num:result){
            System.out.println(Arrays.toString(num));
        }
    }
}
