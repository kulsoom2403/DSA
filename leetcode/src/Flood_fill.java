public class Flood_fill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int initialColor = image[sr][sc];


        if (initialColor == color) {
            return image;
        }


        dfs(image, sr, sc, initialColor, color);

        return image;
    }

    private void dfs(int[][] image, int r, int c, int initialColor, int color) {

        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != initialColor) {
            return ;
        }


        image[r][c] = color;


        dfs(image, r - 1, c, initialColor, color); // up
        dfs(image, r + 1, c, initialColor, color); // down
        dfs(image, r, c - 1, initialColor, color); // left
        dfs(image, r, c + 1, initialColor, color); // right
    }

    public static void main(String[] args) {
        int[][] image ={{1, 1, 1}, {1, 1, 0},
                {1, 0, 1}};
        Flood_fill ff = new Flood_fill();
        ff.floodFill(image,1,1,2);


        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print ( image[i][j] + " " );
            }
            System.out.println ();
        }
    }


}
