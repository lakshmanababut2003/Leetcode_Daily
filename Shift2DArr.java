import java.util.*;

public class Shift2DArr {

    public static void main(String[] args) {
        
        int[][] mat = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int k =1;

        List<List<Integer>> res = new ArrayList<>();

        int m = mat.length;
        int n = mat[0].length;

        int[] arr = new int[m*n];
        int ind =0;

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){
                arr[ind++] = mat[i][j];
            }
        }

        for(int i=0;i<k;i++){

            int temp = arr[arr.length-1];

            for(int j=arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }

            arr[0] = temp;
        }

        int in =0;

        for(int i=0;i<mat.length;i++){

            List<Integer> val = new ArrayList<>();

            for(int j=0;j<mat[0].length;j++){
                val.add(arr[in++]);
            }

            res.add(val);
        }

        System.out.println(res);
    }
    
}
