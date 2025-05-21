public class May_21 {

        public void setZeroes(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            boolean firstRow = false;
            boolean firstcol = false;

            for(int j = 0; j < cols;j++) {
                if(matrix[0][j] == 0){
                    firstRow = true;
                    break;
                }
            }
            for(int i = 0; i < rows;i++) {
                if(matrix[i][0] == 0){
                    firstcol = true;
                    break;
                }
            }
            for(int i = 1;i < rows;i++){
                for(int j = 1; j < cols;j++){
                    if(matrix[i][j] == 0){
                        matrix[i][0] =0;
                        matrix[0][j] = 0;
                    }
                }
            }
            for(int i = 1;i < rows;i++){
                for(int j = 1; j < cols;j++){
                    if(matrix[i][0] == 0|| matrix[0][j] == 0) {
                        matrix[i][j] =0;
                    }
                }
            }
            if(firstRow ){
                for(int j = 0; j < cols;j++){
                    matrix[0][j] = 0;
                }
            }

            if(firstcol ){
                for(int i = 0; i < rows;i++){
                    matrix[i][0] = 0;
                }
            }


        }

    public static void main(String[] args) {
        int[][] grid ={{1,2,3},{4,3,1},{1,4,1}};
        May_21 obj = new May_21();
        obj.setZeroes(grid); // modifies in-place

        // Print the modified grid
        for (int[] row : grid) {
            for (int num : row) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
