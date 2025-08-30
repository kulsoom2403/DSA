public class Aug_30 {

    // Step 1  Traverse the board
    public boolean isValidSudoku(char[][] board)
    {
        for (int row = 0; row < 9; row++)
        {
            for (int col = 0; col < 9; col++)
            {
                if (board[row][col] != '.')
                {
                    // Step 2, 3, 4  Validate the digit
                    if (!isSafe(board, row, col, board[row][col]))
                    {
                        // Step 6  If any check fails
                        return false;
                    }
                }
            }
        }

        // Step 6  If all cells are valid
        return true;
    }

    public static boolean isSafe(char[][] sudoku, int row, int col, char digit)
    {
        // Step 2  Check the row
        for (int i = 0; i < 9; i++)
        {
            if (i != col && sudoku[row][i] == digit)
            {
                return false;
            }
        }

        // Step 3  Check the column
        for (int i = 0; i < 9; i++)
        {
            if (i != row && sudoku[i][col] == digit)
            {
                return false;
            }
        }

        // Step 4  Check the 3x3 subgrid
        int subgridStartRow = (row / 3) * 3;
        int subgridStartCol = (col / 3) * 3;
        for (int i = subgridStartRow; i < subgridStartRow + 3; i++)
        {
            for (int j = subgridStartCol; j < subgridStartCol + 3; j++)
            {
                if ((i != row || j != col) && sudoku[i][j] == digit)
                {
                    return false;
                }
            }
        }

        // Step 5  Current cell is valid
        return true;
    }

    // Main Method
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        Aug_30 sudokuValidator = new Aug_30();
        boolean result = sudokuValidator.isValidSudoku(board);

        System.out.println(result);
    }
}
