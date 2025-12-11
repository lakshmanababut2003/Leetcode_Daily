public class CountCoveredBuildings {

    public static void main(String[] args) {

        int n = 3;

        int[][] b = new int[][]{
            {2,1}, {2,3}, {3,3}, {2,2}, {1,3}
        };

        int size = n+1;

        int[] rmax = new int[size];
        int[] rmin = new int[size];
        int[] cmax = new int[size];
        int[] cmin = new int[size];

        for(int[] p : b){

            int x = p[0];
            int y = p[1];

            rmax[y] = Math.max(rmax[y] , x);
            rmin[y] = Math.min(rmin[y] , x);

            cmax[x] = Math.max(cmax[x] , y);
            cmin[x] = Math.min(cmin[x] , y);
        }

        int ans =0;

        for(int[] p : b){

            int x =p[0];
            int y = p[1];

            if(rmin[y] < x && rmax[y] > x && cmin[x] < y && cmax[x] > y){
                ans++;
            }
        }

        System.out.println(ans);
    }
}
