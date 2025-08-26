public class Aug_26 {

        public int areaOfMaxDiagonal(int[][] dimensions) {
            double  maxDiagonal = 0;
            int maxArea = 0;

            for(int[] dim:dimensions){
                int length = dim[0];
                int width = dim[1];

                double diagonal = Math.sqrt(length*length + width*width );

                int area = length*width;

                if(diagonal > maxDiagonal || (diagonal == maxDiagonal && area > maxArea)){
                    maxDiagonal = diagonal;
                    maxArea = area;
                }
            }
            return maxArea;
        }

    public static void main(String[] args) {
        int[][] arr = {{2,4},{5,6}};
        Aug_26 obj = new Aug_26();
        int result = obj.areaOfMaxDiagonal(arr);
        System.out.println(result);
    }
}
