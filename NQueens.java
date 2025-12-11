
public class NQueens {

    public static void main(String[] args) {

        int n = 4;

        boolean[][] board = new boolean[n][n];

        System.out.println(nQueens(board, 0));
    }

    private static int nQueens(boolean[][] b, int row) {

        if (row == b.length) {
            display(b);
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < b.length; col++) {

            if (isSafe(b, row, col)) {
                b[row][col] = true;
                count += nQueens(b, row + 1);
                b[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] b, int row, int col) {

        for (int i = 0; i < row; i++) {

            if (b[i][col]) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {

            if (b[i][j]) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < b.length; i--, j++) {

            if (b[i][j]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] b) {
        for (boolean[] row : b) {
            for (boolean ele : row) {

                if (ele) {
                    System.out.printf("%2s", "Q");

                } else {
                    System.out.printf("%2s", ".");

                }
            }
            System.out.println();
        }
    }
}