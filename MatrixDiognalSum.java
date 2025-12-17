public class MatrixDiognalSum {

    public static void main(String[] args) {
        
        int[][] mat = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int row = 0 , col = 0 , d1 = 0 , d2 = 0;

        int n = mat.length;

        while(row < n){
            d1+= mat[row][col];
            d2+=mat[row][n-1-col];
            row++;
            col++;
        }

        int mid = n % 2 == 0 ? 0 : mat[n/2][n/2];

        System.out.println(d1+d2-mid);
    }
    
}
