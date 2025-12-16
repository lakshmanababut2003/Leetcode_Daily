// leetcoce matrix pathila list irukum

public class Triangle {

    public static void main(String[] args) {
        
        int[][] mat = new int[][] {
            {2} , {3,4} , {6,5,7} , {4,1,8,3}
        };

        int n = mat.length;

        int[] dp = new int[n];

        for(int i=0;i<n;i++){
            dp[i] = mat[n-1][i];
        }

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                dp[j] = mat[i][j] + Math.min(dp[j] , dp[j+1]);
            }
        }


        System.out.println(dp[0]);
    }
    
}
