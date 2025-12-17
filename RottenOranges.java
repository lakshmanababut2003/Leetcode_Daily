public class RottenOranges {

    public static void main(String[] args) {
        
        int[][] grid = new int[][]{
            {2,1,1},
            {1,1,0},
            {0,1,1}
        };

        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){

                if(grid[i][j] == 2){
                    dfs(grid , i , j , 2);
                }
            }
        }

        int time = 2;

        for(int[] arr : grid){
            for(int ele : arr){
                if(ele == 1){
                    System.out.println(-1);
                    return;
                }
                else{
                    time = Math.max(time , ele);
                }
            }
        }

        System.out.println(time -2);
    }

    private static void dfs(int[][] grid , int i , int j , int currTime){

        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
            || grid[i][j] == 0 || (1 < grid[i][j] && grid[i][j] < currTime)
        ){
            return;
        }
        else{

            grid[i][j] = currTime;

            dfs(grid , i-1,j,currTime+1);
            dfs(grid , i+1 , j , currTime+1);
            dfs(grid , i , j-1 , currTime+1);
            dfs(grid , i , j+1 , currTime+1);
        }
    }
    
}
